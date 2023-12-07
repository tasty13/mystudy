package bitcamp.myapp.menu;

import bitcamp.util.AnsiEscape;
import bitcamp.util.Prompt;

public class MainMenu {

  static final String APP_TITLE =
      AnsiEscape.ANSI_BOLD_RED + "[과제관리 시스템]" + AnsiEscape.ANSI_CLEAR;
  static final String[] MENUS = {
      "1. 과제",
      "2. 게시글",
      "3. 회원",
      "4. 가입인사",
      "5. 도움말",
      AnsiEscape.ANSI_RED + "0. 종료" + AnsiEscape.ANSI_CLEAR
  };
  Prompt prompt;

  public MainMenu(Prompt prompt) {
    this.prompt = prompt;
  }

  static void printMenu() {
    // ANSI 코드와 App 제목, 메뉴를 저장한 변수를 메서드 안에 두는 대신에 클래스 블록 안에 두면
    // printMenu()를 호출할 때마다 변수를 만들지 않기 때문에
    // 실행 속도나 메모리 부분에서 훨씬 효율적이다.
    // 보통 메서드가 호출될 때마다 값이 바뀌는 변수가 아니라 고정 값을 갖는 변수인 경우
    // 메서드 밖에 두는 것이 좋다.
    System.out.println(APP_TITLE);
    System.out.println();
    for (String menu : MENUS) {
      System.out.println(menu);
    }
  }

  public void execute() {
    BoardMenu boardMenu = new BoardMenu("게시판", this.prompt);
    // 이러면 Heap에 boards/length변수, Board[3] 만들어지고 boardMenu에 boards/length변수 주소 들어감
    // Board 객체 주소를 담을 수 있는 레퍼런스의 배열
    // Boards[3]의 주소는 boards에 들어간다.

    BoardMenu greetingMenu = new BoardMenu("가입인사", this.prompt);
    // 따로따로 만들었기 때문에 boardMenu와 greetingMenu는 다름(넘겨주는 주소가 다르다)

    AssignmentMenu assignmentMenu = new AssignmentMenu("과제", this.prompt);
    MemberMenu memberMenu = new MemberMenu("회원", this.prompt);

    printMenu();

    while (true) {
      String input = this.prompt.input("메인> ");

      switch (input) {
        case "1":
          assignmentMenu.execute();
          break;
        case "2":
          boardMenu.execute();  // 배열 주소와 갯수 저장하고 있는 인스턴스 주소 넘김
          break;
        case "3":
          memberMenu.execute();
          break;
        case "4":
          greetingMenu.execute();
          break;
        case "5":
          System.out.println("도움말입니다.");
          break;
        case "0":
          System.out.println("종료합니다.");
          return;
        case "menu":
          printMenu();
          break;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
    }
  }
}
