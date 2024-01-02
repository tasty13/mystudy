package algorithm.test.baekjoon.level05.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine());
    for (int i = 0; i < num; i++) {
      String str = br.readLine();
      sb.append(str.charAt(0));
      sb.append(str.charAt(str.length() - 1));
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
