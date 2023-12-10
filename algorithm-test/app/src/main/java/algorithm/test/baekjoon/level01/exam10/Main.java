package algorithm.test.baekjoon.level01.exam10;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws Exception {
	Scanner s = new Scanner(System.in);
    int A = s.nextInt();
    int B = s.nextInt();
    
    int a = B%10;
    int b = B%100/10;
    int c = B/100;
    
    System.out.println(A*a);
    System.out.println(A*b);
    System.out.println(A*c);
    System.out.println(A*B);
  }
}
