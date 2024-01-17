package algorithm.test.baekjoon.level07.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[][] chars = new char[5][15];

    for (int i = 0; i < 5; i++) {
      chars[i] = br.readLine().toCharArray();
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        if (i < chars[j].length && chars[j][i] != '\0') {
          sb.append(chars[j][i]);
        }
      }
    }
    System.out.print(sb);
  }
}
