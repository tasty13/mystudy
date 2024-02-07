package algorithm.test.baekjoon.level09.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());

    for (int d = 2; d <= Math.sqrt(N); d++) {
      while (N % d == 0) {
        System.out.println(d);
        N = N / d;
      }
    }

    if (N != 1) {
      System.out.println(N);
    }
  }
}
