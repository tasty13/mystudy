package algorithm.test.baekjoon.level04.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] N = new int[Integer.parseInt(st.nextToken())];
    int M = Integer.parseInt(st.nextToken());

    for (int a = 0; a < N.length; a++) {
      N[a] = a + 1;
    }

    for (int a = 0; a < M; a++) {
      StringTokenizer balls = new StringTokenizer(br.readLine(), " ");
      int i = Integer.parseInt(balls.nextToken());
      int j = Integer.parseInt(balls.nextToken());
      int tmp = N[i - 1];
      N[i - 1] = N[j - 1];
      N[j - 1] = tmp;
    }

    for (int a = 0; a < N.length; a++) {
      System.out.printf("%d ", N[a]);
    }

  }
}
