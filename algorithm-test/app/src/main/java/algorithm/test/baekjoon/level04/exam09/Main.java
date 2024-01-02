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
      int[] reverse = new int[last - first + 1];
      System.arraycopy(arr, first, reverse, 0, reverse.length);

      int i = 0;
      while (i <= arr.length) {
        if (i == first) {
          for (int j = reverse.length - 1; j >= 0; j--, i++) {
            arr[i] = reverse[j];
          }
        } else {
          i++;
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int a : arr) {
      sb.append(a + " ");
    }
    System.out.print(sb);
  }
}
