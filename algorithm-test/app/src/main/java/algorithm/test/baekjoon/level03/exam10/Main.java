package algorithm.test.baekjoon.level03.exam10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    int num = Integer.parseInt(br.readLine());

    for (int i = 1; i <= num; i++) {
      for (int k = num - i; k >= 1; k--) {
        sb.append(" ");
      }
      for (int j = 1; j <= i; j++) {
        sb.append("*");
      }
      sb.append("\n");
      sb.delete(0, i);
    }
    System.out.print(sb);
  }
}
