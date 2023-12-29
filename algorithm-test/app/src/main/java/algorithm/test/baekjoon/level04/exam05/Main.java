package algorithm.test.baekjoon.level04.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    // num N count M
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    int num = Integer.parseInt(st1.nextToken());
    int count = Integer.parseInt(st1.nextToken());
    int[] arr = new int[num];

    // for M~ -> 정수 세개 받음 1 ~ 2에 3번 넣기
    for (int i = 0; i < count; i++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
      int first = Integer.parseInt(st2.nextToken()) - 1;
      int last = Integer.parseInt(st2.nextToken()) - 1;
      int ballNum = Integer.parseInt(st2.nextToken());

      // 값 덮어쓰기
      for (; first <= last; first++) {
        arr[first] = ballNum;
      }
    }
    for (int i : arr) {
      System.out.printf("%d ", i);
    }

  }
}
