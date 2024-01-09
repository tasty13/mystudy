package algorithm.test.baekjoon.level06.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static int countChar(String str, String string) {
    return str.length() - str.replace(String.valueOf(string), "").length();
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();

    // 1. str배열이랑 count배열
    // 2. str 한글자씩 읽음, 해당 글자가 있는지 검사
    // 2-1. 배열에 글자가 없으면 배열에 추가, 해당 인덱스 count+1
    // 2-1. 있으면 해당 인덱스 count+1만
    // 3. int max, Char c
    // 4. max와 같은 count가 있다면 ? 출력, 아니라면 c 출력

    List<Character> strList = new ArrayList<>();
    List<Integer> counts = new ArrayList<>();
    int max = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (!strList.contains(c)) {
        strList.add(c);
        counts.add(1);
      } else {
        int count = counts.get(strList.indexOf(c));
        counts.set(strList.indexOf(c), count++);
        if (max > count) {
          max = count;
        }
      }
    }

    strList.forEach(System.out::print);
    System.out.println();
    for (int i : counts) {
      System.out.print(i);
    }

    Character result = null;
    for (int i = 0; i <= counts.size(); i++) {
      if (counts.get(i) == max) {
        result = '?';
        break;
      }
      if (counts.get(i) > max) {
        result = strList.get(i);
      }
    }
    System.out.print(result);
  }
}
