package algorithm.test.baekjoon.level05.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] result = new int[26];
    for (int i = 0; i < result.length; i++) {
      result[i] = -1;
    }
    char[] arr = br.readLine().toCharArray();

    for (int i = 0; i < arr.length; i++) {
      if (result[arr[i] - 'a'] == -1) {
        result[arr[i] - 'a'] = i;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i : result) {
      sb.append(i);
      sb.append(" ");
    }
    System.out.print(sb);
  }
}
