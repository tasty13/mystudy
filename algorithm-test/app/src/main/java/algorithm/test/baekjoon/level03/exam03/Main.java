package algorithm.test.baekjoon.level03.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long sum = 0, num = Long.parseLong(br.readLine());
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
