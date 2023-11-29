/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitcamp.myapp;

public class App {

  public static void main(String[] args) {

    String ANSI_BOLD_RED = "\033[1;31m";
    String ANSI_RED = "\033[0;31m";
    String ANSI_CLEAR = "\033[0m";

    String appTitle = "[과제관리 시스템]";
    String[] menus = new String[]{
        "1. 과제",
        "2. 게시글",
        "3. 도움말",
        ANSI_RED + "4. 종료" + ANSI_CLEAR
    };

    System.out.println(ANSI_BOLD_RED + appTitle + ANSI_CLEAR);
    System.out.println();
    for (String menu : menus) {
      System.out.println(menu);
    }

    java.util.Scanner scanner = new java.util.Scanner(System.in);

    loop:
    while (true) {
      System.out.print("> ");

      String input = scanner.nextLine();

      switch (input) {
        case "1":
          System.out.println("과제입니다.");
          break;
        case "2":
          System.out.println("게시글입니다.");
          break;
        case "3":
          System.out.println("도움말입니다.");
          break;
        case "4":
          System.out.println("종료합니다.");
          break loop;
        case "menu":
          System.out.println(ANSI_BOLD_RED + appTitle + ANSI_CLEAR);
          System.out.println();
          for (String s : menus) {
            System.out.println(s);
          }
          break;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
          break;
      }
    }
    scanner.close();
  }
}
