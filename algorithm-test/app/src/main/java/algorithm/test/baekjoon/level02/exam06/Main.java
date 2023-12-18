package algorithm.test.baekjoon.level02.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
    int hour = Integer.parseInt(st1.nextToken());
    int min = Integer.parseInt(st1.nextToken());
    int cookmin = Integer.parseInt(st2.nextToken());

    // 0. 주어진 분 단위 시간을 h/m으로 저장
    int[] cook = new int[2];
    cook[0] = cookmin / 60;
    cook[1] = cookmin - cook[0] * 60;

    // 1. 분 더했는데 60 안 넘을 때(<)-> 그냥 더해줌
    // 2. 분 더했는데 60 넘을 때(>=)-> hour = hour + 1, min = 60 - min
    // 3. 시 더했는데 24 안넘을때(<)-> 걍더해줌
    // 4. 시 더했는데 24 넘을때(>=)-> hour = hour - 24

    if (min + cook[1] < 60) {
      min += cook[1];
    } else {
      hour++;
      min += cook[1] - 60;
    }
    if (hour + cook[0] < 24) {
      hour += cook[0];
    } else {
      hour += cook[0] - 24;
    }

    System.out.printf("%d %d", hour, min);
  }
}
