package algorithm.test.baekjoon.level07.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = 0, max = 0;
    int row = 0, col = 0;

    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < 9; j++) {
        if ((num = Integer.parseInt(st.nextToken())) >= max) {
          max = num;
          row = i + 1;
          col = j + 1;
        }
      }
    }
    System.out.printf("%d\n%d %d", max, row, col);
  }
}
