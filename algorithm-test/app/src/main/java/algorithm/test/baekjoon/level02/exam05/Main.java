package algorithm.test.baekjoon.level02.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    if (m - 45 >= 0) {
      // 1번조건: m - 45 > 0
      System.out.printf("%d %d", h, m - 45);

    } else if (h == 0 && m - 45 < 0) {
      // 2번조건: m - 45했는데 0시에서 23시로 넘어갈 때: if h=0, h=23, 60-(45-m)
      System.out.printf("%d %d", 23, 60 - (45 - m));

    } else {
      // 3번조건: m - 45 < 0: h-1, 60-(45-m)
      System.out.printf("%d %d", h - 1, 60 - (45 - m));

    }
  }
}
