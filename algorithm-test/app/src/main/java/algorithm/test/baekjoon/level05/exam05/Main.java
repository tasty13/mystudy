package algorithm.test.baekjoon.level05.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int sum = 0;
    for (int i = 0; i < count; i++) {
      sum += br.read() - 48;
    }
    System.out.print(sum);
  }
}
