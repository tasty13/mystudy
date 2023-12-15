package algorithm.test.baekjoon.level02.exam03;

public class Main {
  public static void main(String[] args) {
    java.util.Scanner s = new java.util.Scanner(System.in);
    int year = s.nextInt();
    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
      System.out.print(1);
    } else {
      System.out.print(0); 
    }
  }
}

