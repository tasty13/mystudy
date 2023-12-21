package algorithm.test.baekjoon.level03.exam07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long count = Long.parseLong(br.readLine());

    for (int i = 1; i <= count; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      bw.write("Case #" + i + ": ");
      bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
    }
    bw.flush();
    bw.close();
  }
}
