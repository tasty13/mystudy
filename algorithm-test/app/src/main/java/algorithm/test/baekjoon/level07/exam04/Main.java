package algorithm.test.baekjoon.level07.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    // 도화지 초기화
    int[][] canvas = new int[101][101];

    // 색종이의 위치 입력 및 도화지에 색종이 표시 (1로 표시)
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int left = Integer.parseInt(st.nextToken());
      int bottom = Integer.parseInt(st.nextToken());

      for (int x = left; x < left + 10; x++) {
        for (int y = bottom; y < bottom + 10; y++) {
          // 이미 다른 색종이가 있는 경우 겹치는 부분이므로 더하지 않음
          if (canvas[x][y] == 1) {
            continue;
          }
          canvas[x][y] = 1;
        }
      }
    }

    // 검은 영역의 넓이 계산
    int blackArea = 0;
    for (int i = 1; i <= 100; i++) {
      for (int j = 1; j <= 100; j++) {
        if (canvas[i][j] == 0) {
          // 색종이가 없는 부분은 검은 영역이 아니므로 제외
          continue;
        }
        blackArea++;
      }
    }

    // 검은 영역의 넓이 출력
    System.out.println(blackArea);

    // 스캐너 닫기
    br.close();
  }
}
