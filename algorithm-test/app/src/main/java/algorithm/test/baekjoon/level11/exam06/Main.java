package algorithm.test.baekjoon.level11.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    int sum = 0;
    for (long i = 0; i < n - 2; i++) {
      for (long j = i; j < n - 1; j++) {
        for (long k = j; k < n; k++) {
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}
