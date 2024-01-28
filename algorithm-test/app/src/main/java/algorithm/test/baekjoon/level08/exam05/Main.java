package algorithm.test.baekjoon.level08.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// ~ 다시보기 ~
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int result = findMinRooms(N);
    System.out.println(result);

    br.close();
  }

  // 최소 방의 개수를 계산하는 함수
  private static int findMinRooms(int N) {
    if (N == 1) {
      return 1; // 1번 방은 이미 중앙에 위치하므로 1개의 방을 지남
    }

    int R = 1; // 현재 위치한 반지름
    int roomNo = 1; // 현재 위치한 방 번호
    int diff = 6; // 각 반지름마다 방의 개수가 6개씩 늘어남

    // 반지름을 기준으로 현재 방의 위치를 파악하고, N보다 작을 때까지 반복문을 사용하여 이동
    // 이동할 때마다 방 번호를 업데이트하고, 반지름에 따라 방의 차이를 늘려가면서 이동
    while (roomNo < N) {
      roomNo += diff;
      diff += 6;
      R++;
    }

    return R; // 최소 방의 개수 == 현재 위치한 반지름
  }
}
