package algorithm.test.jcp.chap01.exam26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 큰 int/long 수의 합과 연산 오버플로
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    long num1 = Long.parseLong(st.nextToken());
    long num2 = Long.parseLong(st.nextToken());

    // JDK 8부터 Math.addExact() 메서드 추가 -> int변수나 long변수 두개 더함
    // 덧셈 오버플로가 발생하면 ArithmeticException 던짐
    long result = Math.addExact(num1, num2);
    System.out.println(result);
  }
}
