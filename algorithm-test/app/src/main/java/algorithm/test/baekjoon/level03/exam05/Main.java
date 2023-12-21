package algorithm.test.baekjoon.level03.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()) / 4;
    for (int i = 0; i < n; i++) {
      System.out.print("long ");
    }
    System.out.print("int");
  }
}
