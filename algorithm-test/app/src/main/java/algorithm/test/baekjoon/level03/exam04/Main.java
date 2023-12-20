package algorithm.test.baekjoon.level03.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long sum = Long.parseLong(br.readLine());
    long n = Long.parseLong(br.readLine());
    long mysum = 0;
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      mysum += Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
    }
    if (sum == mysum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
