package algorithm.test.baekjoon.level12.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int R = findNum(N);
    System.out.println(R);
  }

  // 주어진 숫자와 결과가 같으면 해당 숫자 출력, 결과가 없으면 0 출력
  private static int findNum(int N) {
    for (int i = 1; i < N; i++) {
      if (calculate(i) == N) {
        return i;
      }
    }
    return 0;
  }

  // %연산 해서 나누기해서 다 더해줌
  private static int calculate(int num) {
    int sum = num;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
