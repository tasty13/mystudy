package algorithm.test.baekjoon.level01.exam02;

public class Main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (0 < a && 0 < b && 10 > a && 10 > b) {
      System.out.println(a + b);
    }
  }
}
