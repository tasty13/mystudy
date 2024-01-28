package algorithm.test.baekjoon.level08.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int V = Integer.parseInt(st.nextToken());

    // 달팽이가 나무 막대를 모두 올라가는데 필요한 일수를 저장
    // (V - B)는 나무 막대의 총 높이에서 밤에 미끄러지는 높이 B를 뺀 값
    // (A - B)는 하루 동안의 실제로 올라갈 수 있는 높이
    // => (V - B) / (A - B)는 달팽이가 올라가는 높이로 나누어지면 필요한 일수
    int C = (V - B) / (A - B) + 1;

    // +1은 마지막 날 도달 후에는 미끄러지지 않으므로 하루를 더해줌
    // (V - B) % (A - B) == 0은 딱 맞게 올라갔을 때(나머지가 0일 때) 하루를 빼줍니다.
    if ((V - B) % (A - B) == 0)
      C--;

    System.out.println(C);
  }
}
