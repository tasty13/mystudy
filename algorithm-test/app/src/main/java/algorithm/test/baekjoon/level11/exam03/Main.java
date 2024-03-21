package algorithm.test.baekjoon.level11.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    // n을 내부에서 n만큼 돌림 -> 수행횟수 n^2 => 최고차항 차수 2
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Long.parseLong(br.readLine());
    System.out.println(num * num + "\n" + 2);
  }
}
