package algorithm.test.baekjoon.level12.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st1.nextToken());
    int m = Integer.parseInt(st1.nextToken());

    StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(st2.nextToken()));
    }

    int closestSum = 0; // 각 조합의 합이 m을 넘지 않으면서 가장 큰 값

    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          int sum = list.get(i) + list.get(j) + list.get(k);
          if (sum <= m && sum > closestSum) {
            closestSum = sum;
          }
        }
      }
    }

    System.out.println(closestSum);

  }
}
