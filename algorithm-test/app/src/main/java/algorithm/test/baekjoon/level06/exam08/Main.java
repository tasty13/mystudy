package algorithm.test.baekjoon.level06.exam08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double result = 0;
    double sum = 0;
    for (int i = 0; i < 20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      st.nextToken();
      double grade = Double.parseDouble(st.nextToken());
      String rate = st.nextToken();
      if (!rate.equals("P")) {
        sum += grade;
        switch (rate) {
          case "A+":
            grade = grade * 4.5;
            break;
          case "A0":
            grade = grade * 4.0;
            break;
          case "B+":
            grade = grade * 3.5;
            break;
          case "B0":
            grade = grade * 3.0;
            break;
          case "C+":
            grade = grade * 2.5;
            break;
          case "C0":
            grade = grade * 2.0;
            break;
          case "D+":
            grade = grade * 1.5;
            break;
          case "F":
            grade = grade * 0.0;
            break;
        }
        result += grade;
      }
    }
    System.out.println(result / sum);
  }
}
