package bitcamp.myapp.handler.board;

import bitcamp.menu.MenuHandler;
import bitcamp.util.Prompt;

// 게시글의 '등록' 메뉴를 선택했을 때 작업을 수행하는 클래스
// 반드시 MenuHandler 규칙에 따라 클래스를 작성해야 함
public class BoardDeleteHandler implements MenuHandler {

  Prompt prompt;
  BoardRepository boardRepository;

  public BoardDeleteHandler(BoardRepository boardRepository, Prompt prompt) {
    this.boardRepository = boardRepository;
    this.prompt = prompt;
  }

  @Override
  public void action() {
    System.out.println("게시글 삭제:");
    // 번호 입력받은 뒤 배열 앞으로 한칸씩 땡김, leng 하나 줄임, 배열의 마지막 요소 null 처리
    int index = this.prompt.inputInt("번호? ");
    if (index < 0 || index >= this.boardRepository.length) {
      System.out.println("게시글 번호가 유효하지 않습니다.");
      return;
    }

    for (int i = index; i < (this.boardRepository.length - 1); i++) {
      this.boardRepository.boards[i] = this.boardRepository.boards[i + 1];
    }
    this.boardRepository.boards[--this.boardRepository.length] = null;
  }
}
