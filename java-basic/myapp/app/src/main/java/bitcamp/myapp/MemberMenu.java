package bitcamp.myapp;

public class MemberMenu {

  static Member[] members = new Member[3];
  static int length = 0;

  static void execute() {
    printMenu();
    while (true) {
      String input = Prompt.input("메인/회원> ");
      switch (input) {
        case "1":
          add();
          break;
        case "2":
          view();
          break;
        case "3":
          modify();
          break;
        case "4":
          delete();
          break;
        case "5":
          list();
          break;
        case "menu":
          printMenu();
          break;
        case "0":
          return;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
    }
  }

  static void printMenu() {
    System.out.println("[회원]");
    System.out.println("1. 등록");
    System.out.println("2. 조회");
    System.out.println("3. 변경");
    System.out.println("4. 삭제");
    System.out.println("0. 이전");
  }

  static void add() {
    System.out.println("회원 추가:");
    if (length == members.length) {
      // 1. 배열 길이 늘리기는 불가하니 더 큰 새 배열 만듦
      int oldSize = members.length;
      int newSize = oldSize + oldSize / 2;
      Member[] temp = new Member[newSize];

      // 2. 새 배열에 원래 배열 데이터 넣어줌
      for (int i = 0; i < oldSize; i++) {
        temp[i] = members[i];
      }

      // 3. 배열 바꿔치기
      members = temp;
    }
    Member member = new Member();
    member.name = Prompt.input("이름? ");
    member.email = Prompt.input("이메일? ");
    member.password = Prompt.input("비밀번호? ");
    member.createdAt = Prompt.input("가입일? ");

    members[length++] = member;
  }

  static void view() {
    System.out.println("회원 조회:");
    int index = Integer.parseInt(Prompt.input("번호? "));
    if (index < 0 || index >= length) {
      System.out.println("존재하지 않는 번호");
      return;
    }
    Member member = members[index];
    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("비밀번호: %s\n", member.password);
    System.out.printf("가입일: %s\n", member.createdAt);

  }

  static void list() {
    System.out.println("회원 목록:");
    System.out.printf("%-10s\t%-10s\t%s\n", "이름", "이메일", "가입일");
    for (int i = 0; i < length; i++) {
      Member member = members[i];
      System.out.printf("%-10s\t%-10s\t%s\n", member.name, member.email, member.createdAt);
    }

  }

  static void modify() {
    System.out.println("회원정보 수정:");
    int index = Integer.parseInt(Prompt.input("번호? "));
    if (index < 0 || index >= length) {
      System.out.println("존재하지 않는 번호");
      return;
    }
    Member member = members[index];
    member.name = Prompt.input("이름(%s)? ", member.name);
    member.email = Prompt.input("이메일(%s)? ", member.email);
    member.password = Prompt.input("비밀번호(%s)? ", member.password);
    member.createdAt = Prompt.input("가입일(%s)? ", member.createdAt);
  }

  static void delete() {
    System.out.println("회원 삭제:");
    int index = Integer.parseInt(Prompt.input("번호? "));
    if (index < 0 || index >= length) {
      System.out.println("존재하지 않는 번호");
      return;
    }

    // 1. 삭제할 데이터 기준으로 배열 값들을 앞으로 한칸씩 땡김
    for (int i = index; i < length - 1; i++) {
      members[i] = members[i + 1];
    }

    // 2. leng값 하나 줄여줌(마지막 인덱스값으로), 맨 끝 데이터값을 null로
    members[--length] = null;
  }
}
