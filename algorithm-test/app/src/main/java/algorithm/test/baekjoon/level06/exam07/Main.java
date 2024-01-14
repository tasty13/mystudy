package algorithm.test.baekjoon.level06.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    List<String> list = new ArrayList<>();
    int count = 0;

    for (int i = 0; i < num; i++) {
      String[] input = br.readLine().split("");

      for (String s : input) {
        if (list.contains(s)) {
          if (!list.get(list.size() - 1).equals(s)) {
            list = new ArrayList<>();
            break;
          }
        } else {
          list.add(s);
        }
      }

      if (!list.isEmpty()) {
        count++;
        list = new ArrayList<>();
      }
    }
    System.out.println(count);
  }
}
