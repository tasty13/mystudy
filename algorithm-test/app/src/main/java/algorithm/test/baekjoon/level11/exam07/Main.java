package algorithm.test.baekjoon.level11.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a1 = Integer.parseInt(st.nextToken());
    int a0 = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(br.readLine());
    int n0 = Integer.parseInt(br.readLine());

    // f(n) = a1 * n + a0가 O(n)을 만족하려면 f(n) ≤ c * g(n) 성립해야함
    // g(n)=n이므로 조건은 a1 * n + a0 ≤ c * n => a1 * n + a0 ≤ c * n 성립하는 최소한의 n값 찾기!

    boolean isBigO = true;
    // n0부터 100까지의 모든 n에 대해 조건을 확인하여, f(n) <= c * n가 성립하는지 확인
    for (int n = n0; n <= 100; n++) {
      if (a1 * n + a0 > c * n) {
        // 하나라도 조건을 만족하지 못하면 isBigO를 false로 설정하고 루프를 중단
        isBigO = false;
        break;
      }
    }

    if (isBigO) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
