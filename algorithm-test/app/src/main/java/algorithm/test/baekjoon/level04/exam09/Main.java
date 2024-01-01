package algorithm.test.baekjoon.level04.exam09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    // 1. N, M 입력받기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    for (int a = 0; a < arr.length; a++) {
      arr[a] = a + 1;
    }

    int[] reverse = new int[arr.length];

    for (int a = 0; a < M; a++) {
      st = new StringTokenizer(br.readLine(), " ");
      int first = Integer.parseInt(st.nextToken()) - 1; // 인덱스를 맞추기 위해 -1
      int last = Integer.parseInt(st.nextToken()) - 1;
      for (int b = 0; b <= last - first; b++, first++, last--) {
        reverse[first] = arr[last];
      }
      for (int c = 0; c < arr.length; c++)
        arr[c] = reverse[c]; // 한 싸이클마다 저장
    }

    for (int a = 0; a < arr.length; a++) {
      System.out.print(reverse[a] + " ");
    }
  }
}
