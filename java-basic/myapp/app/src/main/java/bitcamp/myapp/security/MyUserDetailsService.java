package bitcamp.myapp.security;

import bitcamp.myapp.service.MemberService;
import bitcamp.myapp.vo.Member;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {

  private static final Log log = LogFactory.getLog(SecurityConfig.class);

  // DBMS에서 사용자 정보를 찾아주는 서비스 객체
  MemberService memberService;

  public MyUserDetailsService(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Member member = memberService.get(username);
    if (member == null) {
      throw new UsernameNotFoundException("해당 사용자가 존재하지 않습니다.");
    }

    log.debug(member);

    // 해당 이메일 가진 사용자가 존재한다면 그 사용자 정보를 UserDetails 객체에 담아 return
    // -> Spring Security는 리턴된 UserDetails의 username/pw와
    //    클라이언트가 보낸 username/pw를 비교해 로그인 처리 수행
    return User.builder()
        .username(member.getEmail())
        .password(member.getPassword())
        .roles("USER")
        .build();
  }
}
