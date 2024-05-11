package algorithm.test.jcp.chap01.exam12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(removeDup(br.readLine()));
  }

  public static String removeDup(String str) {
    char[] arr = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    Set<Character> set = new HashSet<>();

    // 만약 set에 다음 문자를 넣는다면 sb에도 문자를 추가해줌
    for (char c : arr) {
      if (set.add(c)) {
        sb.append(c);
      }
    }

    return sb.toString();
  }
}
