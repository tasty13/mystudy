package algorithm.test.baekjoon.level03.exam05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    long t = Long.parseLong(br.readLine());
    for (long i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
      bw.write(sum + "\n");
    }
    bw.flush();
    bw.close();
  }
}
