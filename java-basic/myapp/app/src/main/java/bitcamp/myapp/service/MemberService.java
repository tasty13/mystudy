package bitcamp.myapp.service;

import bitcamp.myapp.vo.Member;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberService {

  void add(Member member);

  List<Member> list(
      @Param("offset") int offset,
      @Param("rowCount") int rowCount);

  Member get(int no);

  Member get(String email, String password);

  int update(Member member);

  int delete(int no);

  int countAll();
}
