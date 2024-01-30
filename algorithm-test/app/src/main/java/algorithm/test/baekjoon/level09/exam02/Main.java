package algorithm.test.baekjoon.level09.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int m = (int) Math.sqrt(a);
    Set<Integer> set = new HashSet<>();
    for (int i = 1; i <= m; i++) {
      if (a % i == 0) {
        set.add(i);
        set.add(a / i);
        System.out.printf("a: %d, a / i = %d\n", i, a / i);
      }
    }

    List<Integer> list = List.copyOf(set);
    Collections.sort(list);
    for (int i : list) {
      System.out.printf("%d ", i);
    }
    System.out.println();

    if (list.size() < b) {
      System.out.println(0);
    } else {
      System.out.println(list.get(b - 1));
    }
  }
}
