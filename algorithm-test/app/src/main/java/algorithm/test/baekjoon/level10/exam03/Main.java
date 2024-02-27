package algorithm.test.baekjoon.level10.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      set.add(Integer.parseInt(st.nextToken()));
      set.add(Integer.parseInt(st.nextToken()));
    }

    for (int i : set) {
      System.out.printf("%d ", i);
    }
  }
}
