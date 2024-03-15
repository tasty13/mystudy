package algorithm.test.baekjoon.level10.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[3];
    for (int i = 0; i < 3; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    // 분명좋은방법이잇을거같은데나는노가다를해. . .
    if ((arr[0] + arr[1] + arr[2]) == 180) {
      if (arr[0] == 60 && arr[1] == 60 && arr[2] == 60) {
        System.out.println("Equilateral");
      } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
        System.out.println("Isosceles");
      } else {
        System.out.println("Scalene");
      }
    } else {
      System.out.println("Error");
    }

  }
}
