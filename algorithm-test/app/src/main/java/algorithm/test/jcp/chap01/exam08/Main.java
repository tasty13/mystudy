package algorithm.test.jcp.chap01.exam08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(removeWhiteSpace(br.readLine()));
  }

  // \s ('space(공백)'의 ‘s’)
  // 스페이스, 탭(\t), 줄 바꿈(\n)을 비롯하여 아주 드물게 쓰이는 \v, \f, \r 을 포함하는 공백 기호
  // 모든 공백 기호를 .replaceAll()로 변경한다.
  public static String removeWhiteSpace(String str) {
    return str.replaceAll("\\s", "");
  }
}
