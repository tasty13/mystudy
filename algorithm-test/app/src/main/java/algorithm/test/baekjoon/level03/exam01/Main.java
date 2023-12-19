package algorithm.test.baekjoon.level03.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = br.read() - 48;
    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %d\n", x, i, x * i);
    }
    br.close();
  }
}
