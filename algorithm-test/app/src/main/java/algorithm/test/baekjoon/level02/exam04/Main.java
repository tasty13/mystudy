package algorithm.test.baekjoon.level02.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long x = Long.parseLong(br.readLine());
    long y = Long.parseLong(br.readLine());

    // x가 양수일때 y가 1. 양수면 1 / 2. 음수면 4
    // x가 음수일떄 y가 2. 양수면 2 / 3. 음수면 3
    if (x > 0) {
      if (y > 0) {
        System.out.println(1);
      } else if (y < 0) {
        System.out.println(4);
      }
    } else if (x < 0) {
      if (y > 0) {
        System.out.println(2);
      } else if (y < 0) {
        System.out.println(3);
      }
    }
  }
}
