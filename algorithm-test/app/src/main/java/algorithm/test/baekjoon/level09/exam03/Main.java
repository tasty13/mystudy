package algorithm.test.baekjoon.level09.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int num;
    while ((num = Integer.parseInt(br.readLine())) != -1) {
      int m = (int) Math.sqrt(num);
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= m; i++) {
        if (num % i == 0) {
          if (i != num / i) {
            list.add(num / i);
          }
          list.add(i);
        }
      }
      list.sort(Comparator.naturalOrder());
      list.remove(list.size() - 1);

      int sum = 0;
      for (int i : list) {
        sum += i;
      }
      if (sum != num) {
        sb.append(num).append(" is NOT perfect.\n");
        continue;
      }

      sb.append(num).append(" = ");
      for (int i : list) {
        sb.append(i);
        if (i != list.get(list.size() - 1)) {
          sb.append(" + ");
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
