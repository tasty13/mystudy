package algorithm.test.baekjoon.level04.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    int num = Integer.parseInt(st1.nextToken());
    int target = Integer.parseInt(st1.nextToken());

    int[] arr = new int[num];
    StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st2.nextToken());
      if (arr[i] < target) {
        sb.append(arr[i]);
        sb.append(" ");
      }
    }
    System.out.print(sb);
  }
}
