package algorithm.test.jcp.chap01.exam16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자열이 부분 문자열을 포함하는지 검사
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String fulltext = br.readLine();
    String subtext = br.readLine();

    System.out.println(fulltext.contains(subtext));
  }
}
