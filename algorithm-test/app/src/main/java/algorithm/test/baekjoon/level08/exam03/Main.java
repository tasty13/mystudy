package algorithm.test.baekjoon.level08.exam03;

public class Main {
  public static void main(String[] args) throws Exception {
    int T = readInt();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      int C = readInt();
      sb.append(C / 25).append(" ");
      sb.append((C = C % 25) / 10).append(" ");
      sb.append((C = C % 10) / 5).append(" ");
      sb.append((C = C % 5) / 1);
      sb.append("\n");
    }
    System.out.print(sb);
  }

  static int readInt() throws Exception {
    int c, n = System.in.read() & 15;
    while ((c = System.in.read()) > 32) {
      n = (n << 3) + (n << 1) + (c & 15);
    }
    if (c == 13) {
      System.in.read();
    }
    return n;
  }
}
