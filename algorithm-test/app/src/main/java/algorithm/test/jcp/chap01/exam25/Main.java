package algorithm.test.jcp.chap01.exam25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 수의 최솟값과 최댓값 계산
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());

    // int max = Math.max(num1, num2);
    // int min = Math.min(num1, num2);
    // JDK 8 이전에는 일케할수있었는데 이제 각 래퍼 클래스마다 min()과 max()가 딸려있으니 그거쓸수도 있다고함

    int max = Integer.max(num1, num2);
    int min = Integer.min(num1, num2);

    System.out.println("최댓값: " + max);
    System.out.println("최솟값: " + min);
  }
}
