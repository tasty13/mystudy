package algorithm.test.baekjoon.level11.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Integer.parseInt(br.readLine());
    System.out.println(n * n * n + "\n" + 3);
  }
}
