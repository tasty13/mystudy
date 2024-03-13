package algorithm.test.baekjoon.level10.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    // 세로-> 쌓인사각형갯수*2
    // 가로-> 밑변사각형갯수*2
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Long.parseLong(br.readLine());
    System.out.println(num * 4);
  }
}
