package algorithm.test.baekjoon.level09.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    int sum = 0;
    List<Integer> list = new ArrayList<>();
    for (int i = N; i <= M; i++) {
      if (i == 1) {
        continue;
      }
      int j = 2;
      for (; j < i; j++) {
        if (i % j == 0) {
          break;
        }
      }
      if (j == i) {
        list.add(i);
        sum += i;
      }
    }

    if (list.isEmpty()) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(list.get(0));
    }
  }
}
