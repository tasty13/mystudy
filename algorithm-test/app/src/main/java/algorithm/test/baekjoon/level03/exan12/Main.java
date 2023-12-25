package algorithm.test.baekjoon.level03.exan12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while (true) {
      String str = br.readLine();
      if (str == "" || str == null)
        break;
      StringTokenizer st = new StringTokenizer(str, " ");
      int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
      sb.append(arr[0] + arr[1] + "\n");
    }
    System.out.print(sb);
  }
}
