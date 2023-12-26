package algorithm.test.baekjoon.level04.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int arr[] = new int[num];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int target = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i : arr) {
      if (i == target) {
        count++;
      }
    }
    System.out.print(count);
  }
}
