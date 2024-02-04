package algorithm.test.baekjoon.level09.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int count = 0;
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (num == 1)
        continue;

      int j = 2;
      for (; j <= (num - 1); j++) {
        if (num % j == 0) {
          break;
        }
      }

      if (j == num)
        count++;
    }
    System.out.println(count);
  }
}
