package bitcamp.myapp.handler.board;

import bitcamp.menu.AbstractMenuHandler;
import bitcamp.myapp.dao.AttachedFileDao;
import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.AttachedFile;
import bitcamp.util.Prompt;

public class BoardDeleteHandler extends AbstractMenuHandler {

  private AttachedFileDao attachedFileDao;
  private BoardDao boardDao;

  public BoardDeleteHandler(BoardDao boardDao, AttachedFileDao attachedFileDao) {
    this.boardDao = boardDao;
    this.attachedFileDao = attachedFileDao;
  }

  @Override
  protected void action(Prompt prompt) {
    try {
      int no = prompt.inputInt("번호? ");
      if (boardDao.delete(no) == 0) {
        prompt.println("게시글 번호가 유효하지 않습니다.");
      } else {
        attachedFileDao.deleteAll(no);
        prompt.println("삭제했습니다!");
      }
    } catch (Exception e) {
      prompt.println("삭제 오류!");
    }
  }
}
