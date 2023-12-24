package algorithm.test.baekjoon.level03.exam08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    long t = Long.parseLong(br.readLine());
    for (long i = 1; i <= t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      sb.append("Case #").append(i).append(": ").append(x).append(" + ").append(y).append(" = ")
          .append(x + y).append("\n");
    }
    System.out.println(sb);
  }
}
