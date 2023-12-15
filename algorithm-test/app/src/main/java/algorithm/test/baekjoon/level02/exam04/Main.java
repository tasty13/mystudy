package algorithm.test.baekjoon.level02.exam04;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    long a = s.nextLong();
    long b = s.nextLong();
    if (a > 0) {
      if (b > 0) {
        System.out.print(1);
      } else {
        System.out.print(4);
      }
    } else if (a < 0) {
      if (b > 0) {
        System.out.print(2);
      } else {
        System.out.print(3);
      }
    }
  }
}
