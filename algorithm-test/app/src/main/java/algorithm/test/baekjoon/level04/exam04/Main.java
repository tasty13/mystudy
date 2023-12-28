package algorithm.test.baekjoon.level04.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];
    int max = 0;
    int index = 0;

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      if (arr[i] > max) {
        max = arr[i];
        index = i + 1;
      }
    }
    System.out.printf("%d\n%d", max, index);
  }
}
