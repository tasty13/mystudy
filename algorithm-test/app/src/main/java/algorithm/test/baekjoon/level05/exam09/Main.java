package algorithm.test.baekjoon.level05.exam09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int f = getNum(st.nextToken());
    int s = getNum(st.nextToken());

    System.out.print(f > s ? f : s);
  }

  static int getNum(String str) throws Exception {
    String sb = new String();
    for (int i = 2; i >= 0; i--) {
      sb += (str.charAt(i));
    }
    return Integer.parseInt(sb);
  }
}
