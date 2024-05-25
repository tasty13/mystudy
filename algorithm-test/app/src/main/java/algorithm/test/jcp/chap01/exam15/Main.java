package algorithm.test.jcp.chap01.exam15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문자열 배열을 길이 순으로 정렬
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    System.out.println("ASC: " + sortArrayByLength(str.toCharArray(), Sort.ASC));
    System.out.println("DESC: " + sortArrayByLength(str.toCharArray(), Sort.DESC));
  }

  public static String sortArrayByLength(String[] strs, Sort direction) {
    // 주어진 배열의 각 문자열마다 String.length()를 호출해 정수값 받음
    // 정수들을 오름차순이나 내림차순으로 정렬
    if (direction.equals(Sort.ASC)) {
      Arrays.sort(strs, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
    } else {
      Arrays.sort(strs, (String s1, String s2) -> (-1) * Integer.compare(s1.length(), s2.length()));
    }
  }

}
