package algorithm.test.baekjoon.level11.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    long sum = n * (n - 1) * (n - 2) / (1 * 2 * 3);

    System.out.println(sum + "\n" + 3);
  }
}
