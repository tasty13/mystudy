package algorithm.test.baekjoon.level11.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    // n 입력하면 i는 1부터 n-1까지, j는 i+1부터 n까지, i*j
    // 수행횟수 -> n-1 + n-2 + ... + 1
    // 최고차항 차수 -> (i * j)

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long sum = 0;
    for (long i = Long.parseLong(br.readLine()) - 1; i > 0; i--) {
      sum += i;
    }
    System.out.println(sum + "\n" + 2);
  }
}
