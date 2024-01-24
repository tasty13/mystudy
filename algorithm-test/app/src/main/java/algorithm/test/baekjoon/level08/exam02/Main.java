package algorithm.test.baekjoon.level08.exam02;

public class Main {
  public static void main(String[] args) throws Exception {
    int num = readInt();
    int r = readInt();

    int k = 0;
    int tmp = num;

    // 이진법 해결하기

    while ((tmp = tmp - (int) (Math.pow(r, ++k))) > 0) {
      System.out.print(tmp + " " + k + "\n");
    }

    StringBuilder sb = new StringBuilder();
    for (int i = k - 1; i >= 0; i--) {
      int n = num / (int) (Math.pow(r, i));
      num = num - (int) (Math.pow(r, i)) * n;
      char c;
      if (n > 9) {
        c = (char) (n - 10 + 'A');
      } else {
        c = (char) (n + '0');
      }
      sb.append(c);
    }
    System.out.println();
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
