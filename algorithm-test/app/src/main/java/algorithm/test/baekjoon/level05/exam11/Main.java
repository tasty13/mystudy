package algorithm.test.baekjoon.level05.exam11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    while ((str = br.readLine()) != null) {
      sb.append(str);
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
