package algorithm.test.baekjoon.level10.exam03;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 6; i++) {
      list.add(getNum());
    }


  }

  private static Integer getNum() throws Exception {
    int c, n = System.in.read() & 15;
    while ((c = System.in.read()) > 32) {
      n = n << 3 + n << 1 + c & 15;
    }
    if (c == 13) {
      System.in.read();
    }
    return n;
  }
}
