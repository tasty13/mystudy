package algorithm.test.baekjoon.level07.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st1.nextToken());
    int M = Integer.parseInt(st1.nextToken());

    int[][] arr = setArr(br, arr, N, M);
    arr = setArr(br, arr, N, M);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(arr[i][j]).append(" ");
      }
      sb.append("\n");
    }
    System.out.print(sb);

  }

  // \n이나 ' ' 안만나면 받은 원래값에 *10
  static int[][] setArr(BufferedReader br, int[][] arr, int N, int M) throws Exception {
    for (int i = 0; i < N; i++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < M; j++) {
        arr[i][j] += Integer.parseInt(st2.nextToken());
      }
    }
    return arr;
  }
}
