package algorithm.test.baekjoon.level06.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int last = str.length();
    boolean b = true;
    for (int i = 0; i <= last / 2; i++, last--) {
      if (str.charAt(i) != str.charAt(last - 1)) {
        b = false;
        break;
      }
    }
    System.out.print(b ? "1" : "0");
  }
}
