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

    for (int i = 0; i < list.size(); i++) {
      // 인덱스 0 1 2 이런식으로 덧셈
      // 만약 넘겼다면 그 이전 계산이 정답
      // 최소값도 정해야하나... 셋이 겹치치만 않게 하면 되는데
    }

  }
}
