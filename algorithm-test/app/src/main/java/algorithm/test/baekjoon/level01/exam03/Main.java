package algorithm.test.baekjoon.level01.exam03;

public class Main {
  public static void main(String[] args) throws Exception {
    int a = System.in.read() - 48;
    System.in.read();
    int b = System.in.read() - 48;
    if (0 < a && 0 < b && 10 > a && 10 > b) {
      System.out.println(a - b);
    }
  }
}
