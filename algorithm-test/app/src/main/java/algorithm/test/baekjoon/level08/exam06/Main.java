package algorithm.test.baekjoon.level08.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int sum = 0;
    int n = 1;
    while (true) {
      if (count - (sum + n + 1) < 0) {
        break;
      }
      sum = sum + n++;
    }

    // n+1해주면 해당 행 -> 행의 의미는 분자+분모, count - sum은 해당 열
    // n이 홀수면 분자가 행 - 1 -> 1, n이 짝수면 분자가 1 -> 행 - 1
    int numer = 0;
    if ((n + 1) % 2 != 0) {
      numer = 1 + (count - sum - 1);
    } else {
      numer = (n + 1) - (count - sum);
    }
    System.out.printf("%d/%d", numer, ((n + 1) - numer));
  }
}
