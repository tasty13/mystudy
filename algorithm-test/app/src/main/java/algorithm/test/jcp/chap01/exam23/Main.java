package algorithm.test.jcp.chap01.exam23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 들여쓰기 적용하기
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String text = br.readLine();
    String text = "Monday\nTuesday\nWednesDay\nThursday\nFriday\nSaturday\nSunday";

    String result = moreSent(text);
    System.out.println(result);
  }

  public static String oneSent(String text) {
    return "\t" + text;
  }

  // JDK12 이상에서는 String.indent(int n) 메서드로 텍스트 들여쓰기 가능
  // n -> 들여쓸 칸 수
  // 이런식으로 html 태그도 들여쓰기 할 수 있음: String html = <html>; 하고 html.indent(0) 일케 각각 지정
  public static String moreSent(String text) {
    return text.indent(10);
  }
}
