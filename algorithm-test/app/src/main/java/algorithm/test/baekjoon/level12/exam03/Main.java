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
    double a1 = a * d;
    double b1 = b * d;
    double c1 = c * d;

    double d1 = d * a;
    double e1 = e * a;
    double f1 = f * a;

    // 두번째-첫번째 해서 iy = j 형태 만듦
    double b2 = e1 - b1;
    double c2 = f1 - c1;

    double y = c2 / b2;
    double x = (c - b * y) / a;

    System.out.println((int) x + " " + (int) y);
  }
}
