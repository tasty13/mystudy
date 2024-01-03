package algorithm.test.baekjoon.level05.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());

    for (int a = 0; a < T; a++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int R = Integer.parseInt(st.nextToken());
      String str = st.nextToken();

      for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < R; j++) {
          sb.append(str.charAt(i));
        }
      }
      sb.append("\n");;
    }
    System.out.print(sb);
  }
}
