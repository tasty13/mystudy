package algorithm.test.baekjoon.level04.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];

    int max = -1000000;
    int min = 1000000;
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      min = Math.min(min, arr[i]);
      max = Math.max(max, arr[i]);
    }
    System.out.printf("%d %d", min, max);
  }
}
