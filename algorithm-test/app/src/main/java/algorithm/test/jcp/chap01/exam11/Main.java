package algorithm.test.jcp.chap01.exam11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    System.out.println(check(str));
    System.out.println(isPalindrome(str));
  }

  public static boolean check(String str) {
    int leftidx = 0;
    int rightidx = str.length() - 1;

    while (rightidx > leftidx) {
      if (str.charAt(leftidx) != str.charAt(rightidx)) {
        return false;
      }
      leftidx++;
      rightidx--;
    }
    return true;
  }

  // StringBuilder를 이용해서 한줄로 작성하기 -> 뒤집은 문자열과 같은지 비교한다!
  public static boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
  }
}
