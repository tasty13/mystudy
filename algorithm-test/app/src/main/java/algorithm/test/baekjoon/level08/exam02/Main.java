package algorithm.test.baekjoon.level08.exam02;

public class Main {
  public static void main(String[] args) throws Exception {
    int num = readInt();
    int r = readInt();

    int k = 0;
    while (true) {
      if (num - (int) (Math.pow(r, ++k)) <= 0) {
        break;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = k - 1; i >= 0; i--) {
      int n = num / (int) (Math.pow(r, i));
      num = num - (int) (Math.pow(r, i)) * n;
      if (n == r) {
        sb.append(10);
      } else if (n > 9) {
        char c = (char) (n - 10 + 'A');
        sb.append(c);
      } else {
        sb.append(n);
      }
    }
    System.out.println(sb);
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
