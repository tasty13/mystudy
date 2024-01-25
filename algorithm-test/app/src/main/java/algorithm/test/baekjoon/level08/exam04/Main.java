package algorithm.test.baekjoon.level08.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int r = (int) (Math.pow(2, num));
    System.out.println(4 * 1 + 2 * (r - 1) * 2 + 1 * (r - 1) * (r - 1));
  }
}
