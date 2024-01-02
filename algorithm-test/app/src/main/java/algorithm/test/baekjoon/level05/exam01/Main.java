package algorithm.test.baekjoon.level05.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int num = Integer.parseInt(br.readLine()) - 1;
    System.out.print(str.charAt(num));
  }
}
