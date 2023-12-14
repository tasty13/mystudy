package algorithm.test.baekjoon.level02.exam01;

public class Main {
  public static void main(String[] args) {
    java.util.Scanner s = new java.util.Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    if (a>b) {
      System.out.print(">");
    } else if (a<b) {
      System.out.print("<");
    } else {
      System.out.print("==");
    }
  }
}
