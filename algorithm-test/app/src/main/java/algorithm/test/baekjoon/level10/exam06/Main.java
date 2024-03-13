package algorithm.test.baekjoon.level10.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    int X_MAX = -10000;
    int X_MIN = 10000;
    int Y_MAX = -10000;
    int Y_MIN = 10000;
    for (int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      if (x > X_MAX) {
        X_MAX = x;
      }
      if (x < X_MIN) {
        X_MIN = x;
      }
      if (y > Y_MAX) {
        Y_MAX = y;
      }
      if (y < Y_MIN) {
        Y_MIN = y;
      }
    }

    int size = (X_MAX - X_MIN) * (Y_MAX - Y_MIN);
    System.out.println(size);
  }
}
