package algorithm.test.baekjoon.level04.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] s = new int[28];
    for (int i = 0; i < s.length; i++) {
      s[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(s);

    int count = 1;
    int i = 0;
    while (count <= s.length + 2) {
      if (i >= s.length || count != s[i]) {
        System.out.println(count);
        count++;
        continue;
      }
      i++;
      count++;
    }
  }
}
