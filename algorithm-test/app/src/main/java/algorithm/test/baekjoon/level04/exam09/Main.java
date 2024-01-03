package algorithm.test.baekjoon.level04.exam09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    for (int a = 0; a < arr.length; a++) {
      arr[a] = a + 1;
    }

    for (int a = 0; a < M; a++) {
      st = new StringTokenizer(br.readLine(), " ");
      int first = Integer.parseInt(st.nextToken()) - 1;
      int last = Integer.parseInt(st.nextToken()) - 1;

      for (int i = 0; i < (last - first + 1) / 2; i++) {
        // first랑 last 바꿔줌
        int temp = arr[first + i];
        arr[first + i] = arr[last - i];
        arr[last - i] = temp;
      }

    }

    StringBuilder sb = new StringBuilder();
    for (int a : arr) {
      sb.append(a + " ");
    }
    System.out.print(sb);
  }
}
