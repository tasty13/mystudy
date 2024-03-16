package algorithm.test.baekjoon.level10.exam08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < 3; i++) {
        list.add(Integer.parseInt(st.nextToken()));
      }
      Collections.sort(list);

      if ((list.get(0) + list.get(1) + list.get(2)) == 0) {
        break;
      }

      if (list.get(0) + list.get(1) <= list.get(2)) {
        sb.append("Invalid");
      } else {
        if (list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))) {
          sb.append("Equilateral");
        } else if (list.get(0).equals(list.get(1)) || list.get(1).equals(list.get(2))
            || list.get(2).equals(list.get(0))) {
          sb.append("Isosceles");
        } else {
          sb.append("Scalene");
        }
      }
      sb.append("\n");
    }

    System.out.println(sb);
  }
}
