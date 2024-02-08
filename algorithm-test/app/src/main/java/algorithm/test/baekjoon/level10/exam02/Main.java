package algorithm.test.baekjoon.level10.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int min = 1000;
    int[] ab = new int[2];
    for (int i = 0; i < ab.length; i++) {
      ab[i] = Integer.parseInt(st.nextToken());
      if (ab[i] < min) {
        min = ab[i];
      }
    }

    int[] xy = new int[2];
    for (int i = 0; i < xy.length; i++) {
      xy[i] = Integer.parseInt(st.nextToken());
      if ((xy[i] - ab[i]) < min) {
        min = xy[i] - ab[i];
      }
    }
    System.out.println(min);
  }
}
