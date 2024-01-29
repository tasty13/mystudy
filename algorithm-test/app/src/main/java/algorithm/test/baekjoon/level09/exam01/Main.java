package algorithm.test.baekjoon.level09.exam01;

public class Main {
  public static void main(String[] args) throws Exception {
    StringBuilder sb = new StringBuilder();
    while (true) {
      int a = readInt(), b = readInt();
      if (a == 0 && b == 0) {
        break;
      }
      if (a % b == 0) {
        sb.append("multiple");
      } else if (b % a == 0) {
        sb.append("factor");
      } else {
        sb.append("neither");
      }
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
