package bitcamp.myapp.dao;

import bitcamp.myapp.vo.Member;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberDao {

  public void add(Member member);

  public int delete(int no);

  public List<Member> findAll();

  public Member findBy(int no);

  public int update(Member member);

  public Member findByEmailAndPassword(@Param("email") String email,
      @Param("password") String password); // 이 @Param은 생략불가 (Spring 문법이 아닌 MyBatis 문법
}
