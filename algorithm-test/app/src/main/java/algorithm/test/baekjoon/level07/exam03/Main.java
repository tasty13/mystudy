package algorithm.test.baekjoon.level07.exam03;

public class Main {
  public static void main(String[] args) throws Exception {
    char[][] chars = new char[15][15];

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 15; j++) {
        // read 두번받는데 첫번째꺼 저장, 두번째 \n이면 break
        // 새행은어케함이거
        chars[i][j] = (char) System.in.read();
        if (System.in.read() == '\n') {
          break;
        }
      }
    }
    for (char[] c : chars) {
      System.out.print(c);
    }
  }
}
