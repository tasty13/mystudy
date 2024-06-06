package algorithm.test.jcp.chap01.exam17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자열 내 부분 문자열 빈도수 세기
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String full = br.readLine();
    String text = br.readLine();

    System.out.println(countNum(full, text));
  }

  public static int countNum(String full, String text) {
    int pos = 0;
    int count = 0;
    int n = text.length();

    while ((pos = full.indexOf(text, pos)) != -1) {
      pos += n;
      count++;
    }
    return count;
  }
}
