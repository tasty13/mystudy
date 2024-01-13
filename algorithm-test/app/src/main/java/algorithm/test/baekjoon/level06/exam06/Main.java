package algorithm.test.baekjoon.level06.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strarr = br.readLine().split("");
    String[] alps = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    StringBuilder sb = new StringBuilder();
    StringBuilder result = new StringBuilder();
    for (String a : strarr) {
      sb.append(a);
      for (String b : alps) {
        if (sb.toString().contains(b)) {
          result.append(sb.delete(sb.length() - b.length() + 1, sb.length()));
          sb.delete(0, sb.length());
        }
      }
    }
    result.append(sb);

    System.out.println(result.length());
  }
}
