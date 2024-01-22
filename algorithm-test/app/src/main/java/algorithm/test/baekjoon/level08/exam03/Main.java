package algorithm.test.baekjoon.level08.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      int C = Integer.parseInt(br.readLine()) % 5;
      sb.append(C / 0.25).append(" ");
      sb.append(C % 0.25 / 0.1).append(" ");
      sb.append(C % 0.1 / 0.05).append(" ");
      sb.append(C % 0.05 / 0.01).append(" ");
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
