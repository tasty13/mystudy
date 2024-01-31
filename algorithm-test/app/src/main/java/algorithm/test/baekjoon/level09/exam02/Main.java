package algorithm.test.baekjoon.level09.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int m = (int) Math.sqrt(a);
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= m; i++) {
      if (a % i == 0) {
        if (i != a / i) {
          list.add(a / i);
        }
        list.add(i);
      }
    }
    list.sort(Comparator.naturalOrder());

    if (list.size() < b) {
      System.out.println(0);
    } else {
      System.out.println(list.get(b - 1));
    }
  }
}
