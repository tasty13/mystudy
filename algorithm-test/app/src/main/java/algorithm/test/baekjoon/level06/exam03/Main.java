package algorithm.test.baekjoon.level06.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine());

    for (int i = 1, j = num - 1; i <= num; i++, j--) {
      for (int a = 0; a < j; a++) {
        sb.append(" ");
      }
      for (int a = 1; a <= 2 * i - 1; a++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    for (int i = num - 1, j = 1; i >= 1; i--, j++) {
      for (int a = 1; a <= j; a++) {
        sb.append(" ");
      }
      for (int a = 2 * i - 1; a >= 1; a--) {
        sb.append("*");
      }
      sb.append("\n");
    }

    System.out.print(sb);
  }
}
