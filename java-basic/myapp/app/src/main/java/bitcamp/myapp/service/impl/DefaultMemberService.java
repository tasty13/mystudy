package bitcamp.myapp.service.impl;

import bitcamp.myapp.dao.MemberDao;
import bitcamp.myapp.service.MemberService;
import bitcamp.myapp.vo.Member;
import java.io.File;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DefaultMemberService implements MemberService {

  private MemberDao memberDao;

  public DefaultMemberService(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Transactional
  @Override
  public void add(Member member) {
    memberDao.add(member);
  }

  @Override
  public List<Member> list() {
    return memberDao.findAll();
  }

  @Override
  public Member get(int no) {
    return memberDao.findBy(no);
  }

  @Transactional
  @Override
  public int update(Member member) {
    return memberDao.update(member);
  }

  @Transactional
  @Override
  public int delete(int no) {
    return memberDao.delete(no);
  }

}
