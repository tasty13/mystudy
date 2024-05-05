package algorithm.test.jcp.chap01.exam10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    permuteAndPrint(br.readLine());
  }

  public static void permuteAndPrint(String str) {
    permuteAndPrint("", str);
    // 최초 접두사는 빈 문자열인 ""이어야 함
    // 반복할 때마다 접두사에 문자열의 다음 문자를 이어붙이고 메서드를 진행하며 남은 글자들을 다시 전달함
  }

  public static void permuteAndPrint(String prefix, String str) {
    int n = str.length();

    if (n == 0) {
      System.out.print(prefix + " "); // 띄어쓰기 붙여줌
    } else {
      for (int i = 0; i < n; i++) {
        // 결과 + 다음문자
        permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
      }
    }
  }
}
