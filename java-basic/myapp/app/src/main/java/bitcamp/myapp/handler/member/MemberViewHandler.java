package bitcamp.myapp.handler.member;

import bitcamp.menu.AbstractMenuHandler;
import bitcamp.myapp.dao.MemberDao;
import bitcamp.myapp.vo.Member;
import bitcamp.util.Prompt;

public class MemberViewHandler extends AbstractMenuHandler {

  private MemberDao memberDao;

  public MemberViewHandler(MemberDao memberDao, Prompt prompt) {
    super(prompt);
    this.memberDao = memberDao;
  }

  @Override
  protected void action() {
    int index = this.prompt.inputInt("번호? ");
    Member member = this.memberDao.findBy(index);
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("가입일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", member.getCreatedDate());
  }
}
