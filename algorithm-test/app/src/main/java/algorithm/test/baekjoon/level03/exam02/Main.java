package algorithm.test.baekjoon.level03.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine());
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < times; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      arr.add(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
    }
    for (int sum : arr) {
      System.out.println(sum);
    }
  }
}
