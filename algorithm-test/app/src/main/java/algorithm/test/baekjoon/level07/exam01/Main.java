package algorithm.test.baekjoon.level07.exam01;

public class Main {
  public static void main(String[] args) throws Exception {
    final int N = getInt();
    final int M = getInt();

    final int[][] arr = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        arr[i][j] = getInt();
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        arr[i][j] += getInt();
        sb.append(arr[i][j]).append(' ');
      }
      sb.append('\n');
    }
    System.out.print(sb);

  }

  // 이클립스에서실행이안됨...........................
  static int getInt() throws Exception {
    int result = 0;
    int num = 0;
    while ((num = System.in.read()) != '\n' && num != ' ') {
      result = result * 10 + (num - '0');
    }
    return result;
  }
}
