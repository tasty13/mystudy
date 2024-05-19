package algorithm.test.jcp.chap01.exam13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

// 주어진 문자 제거하기
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char c = (char) System.in.read();
    System.out.println(removeChar(str, c));
  }

  public static String removeChar(String s, char c) {
    return s.replaceAll(Pattern.quote(String.valueOf(c)), "");
    // Pattern.quote 메서드로 래핑 (특수문자 이스케이프 위해서!)
    // 이 메서드는 명시되ㅏㄴ 문자열의 리터럴 패턴 변환
  }
}
