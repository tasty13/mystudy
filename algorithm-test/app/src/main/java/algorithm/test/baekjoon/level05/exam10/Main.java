package algorithm.test.baekjoon.level05.exam10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    // 시간: 3+@ abc->2 def->3
    // 3부터: read() - '9' -> 012 345 678 -> /해서 더해주자
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int time = 3 * str.length();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if ((c - 'Y') >= 0) {
        c -= 'C';
      } else if ((c - 'S') >= 0) {
        c -= 'B';
      } else {
        c -= 'A';
      }
      time += c / 3;
    }
    System.out.println(time);
  }
}
