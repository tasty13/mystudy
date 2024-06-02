package algorithm.test.baekjoon.level12.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    int f = Integer.parseInt(st.nextToken());

    // x의 계수 맞춰줌 (각각 d랑 a 곱함)
    int a1 = a * d;
    int b1 = b * d;
    int c1 = c * d;

    int d1 = d * a;
    int e1 = e * a;
    int f1 = f * a;

    // 두번째-첫번째 해서 iy = j 형태 만듦
    int b2 = e1 - b1;
    int c2 = f1 - c1;

    int y = c2 / b2;
    int x = (c - b * y) / a;

    System.out.println(x + " " + y);
  }
}
