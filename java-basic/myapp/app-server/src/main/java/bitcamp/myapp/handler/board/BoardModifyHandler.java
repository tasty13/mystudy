package bitcamp.myapp.handler.board;

import bitcamp.menu.AbstractMenuHandler;
import bitcamp.myapp.dao.AttachedFileDao;
import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.AttachedFile;
import bitcamp.myapp.vo.Board;
import bitcamp.myapp.vo.Member;
import bitcamp.util.Prompt;
import java.util.ArrayList;
import java.util.List;

public class BoardModifyHandler extends AbstractMenuHandler {

  private BoardDao boardDao;
  private AttachedFileDao attachedFileDao;

  public BoardModifyHandler(BoardDao boardDao, AttachedFileDao attachedFileDao) {
    this.boardDao = boardDao;
    this.attachedFileDao = attachedFileDao;
  }

  @Override
  protected void action(Prompt prompt) {
    try {
      int no = prompt.inputInt("번호? ");

      Member loginUser = (Member) prompt.getSession().getAttribute("loginUser");
      if (loginUser == null) {
        prompt.println("로그인하시기 바랍니다.");
        return;
      }

      Board oldBoard = boardDao.findBy(no);
      if (oldBoard == null) {
        prompt.println("게시글 번호가 유효하지 않습니다.");
        return;
      } else if (oldBoard.getWriter().getNo() != loginUser.getNo()) {
        prompt.println("게시글 변경 권한이 없습니다.");
        return;
      }

      Board board = new Board();
      board.setNo(oldBoard.getNo()); // 기존 게시글의 번호를 그대로 설정한다.
      board.setTitle(prompt.input("제목(%s)? ", oldBoard.getTitle()));
      board.setContent(prompt.input("내용(%s)? ", oldBoard.getContent()));
      board.setCreatedDate(oldBoard.getCreatedDate());

      // 파일 추가/삭제/경로수정해야 함
      // list에 attachedFile 담아서 현재 첨부파일 보여줌
      // 선택지: 추가/수정/삭제/목록
      // 추가-> path 받아서 추가
      // 삭제-> 번호 받아서 삭제
      prompt.println("첨부파일 수정");
//      List<AttachedFile> list = new ArrayList<>();

      String num = "1";
      while (num != "0") {
        prompt.println("1.추가\n2.삭제\n3.목록\n0.완료");
        num = prompt.input("> ");
        AttachedFile file = new AttachedFile();
        switch (num) {
          case "1":
            file.filePath(prompt.input("파일 경로? "));
            file.setBoardNo(board.getNo());
            attachedFileDao.add(file);
            prompt.println("추가했습니다.");
            break;
          case "2":
            int fileNo = prompt.inputInt("번호? ");
            if (attachedFileDao.delete(fileNo) == 0) {
              prompt.println("유효하지 않은 번호입니다.");
            } else {
              prompt.println("삭제했습니다.");
            }
            break;
          case "3":
            prompt.println("-----------------------------");
            prompt.println("첨부파일: ");
            List<AttachedFile> list = attachedFileDao.findAllByBoardNo(board.getNo());
            prompt.printf("%-4s\t%s\n", "No", "filepath");
            for (AttachedFile f : list) {
              prompt.printf("%-4s\t%s\n", f.getNo(), f.getFilePath());
            }
            prompt.println("-----------------------------");
            break;
          case "0":
            return;
          default:
            prompt.println("유효하지 않은 번호입니다.");
            break;
        }
      }

      boardDao.update(board);
      prompt.println("게시글을 변경했습니다.");

    } catch (Exception e) {
      prompt.println("변경 오류!");
    }
  }
}
