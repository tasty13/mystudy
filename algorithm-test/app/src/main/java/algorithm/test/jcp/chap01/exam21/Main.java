package algorithm.test.jcp.chap01.exam21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자열 앞뒤 여백 제거
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String txt = br.readLine();
    String txt = "\n \n\n hello \t \n \r";

    // String.trim() -> 앞뒤 모든 공백 제거
    // System.out.println(txt.trim());

    // 근데 trim은 유니코드를 인식하지 못함(U+0020 이하 문자열만 처리 가능)
    // JDK11부터 String.strip() 메서드를 통해 처리 가능
    System.out.println(txt.strip());

    // ** stripLeading-> 앞 여백 제거, stripTrailing-> 뒤 여백 제거
  }
}
