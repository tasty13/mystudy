package algorithm.test.jcp.chap01.exam20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String text = br.readLine();
    int num = Integer.parseInt(br.readLine());

    // JDK 11 이전 버전
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < num; i++) {
    // sb.append(text);
    // }
    //
    // System.out.println(sb.toString());

    // JDK 11 이후-> String.repeat(int count) 사용
    // 내부적으로 System.arraycopy 사용해서 빠르다!
    String result = text.repeat(num);
    System.out.println(result);
  }
}
