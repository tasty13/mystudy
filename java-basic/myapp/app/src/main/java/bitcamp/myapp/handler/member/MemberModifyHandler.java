package bitcamp.myapp.handler.member;

import bitcamp.menu.Menu;
import bitcamp.menu.MenuHandler;
import bitcamp.myapp.vo.Member;
import bitcamp.util.AnsiEscape;
import bitcamp.util.Prompt;
import java.util.ArrayList;

public class MemberModifyHandler implements MenuHandler {

  Prompt prompt;
  ArrayList<Member> objectRepository;

  public MemberModifyHandler(ArrayList<Member> objectRepository, Prompt prompt) {
    this.objectRepository = objectRepository;
    this.prompt = prompt;
  }

  @Override
  public void action(Menu menu) {
    System.out.printf(AnsiEscape.ANSI_BOLD + "[%s]\n" + AnsiEscape.ANSI_CLEAR, menu.getTitle());
    // index 받음-> oldMember 저장-> 새멤버 만듦-> repo.set에서 새멤버로 변경해줌

    int index = this.prompt.inputInt("번호? ");
    Member oldMember = objectRepository.get(index);

    if (oldMember == null) {
      System.out.println("회원 번호가 유효하지 않습니다.");
      return;
    }

    Member newMember = new Member();
    newMember.email = this.prompt.input("이메일(%s)? ", oldMember.email);
    newMember.name = this.prompt.input("이름(%s)? ", oldMember.name);
    newMember.password = this.prompt.input("새 암호? ");
    newMember.createdDate = this.prompt.input("가입일(%s)? ", oldMember.createdDate);
    objectRepository.set(index, newMember);
  }
}
