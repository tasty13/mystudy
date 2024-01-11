package algorithm.test.baekjoon.level06.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();

    List<Character> strList = new ArrayList<>();
    List<Integer> counts = new ArrayList<>();
    int max = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (!strList.contains(c)) {
        strList.add(c);
        counts.add(1);
        if (max < 1) {
          max = 1;
        }
      } else {
        int index = strList.indexOf(c);
        int count = counts.get(index);
        counts.set(index, ++count);
        if (max < count) {
          max = count;
        }
      }
    }

    Character result = null;
    if (Collections.frequency(counts, max) >= 2) {
      result = '?';
    } else {
      result = strList.get(counts.indexOf(max));
    }
    System.out.print(result);
  }
}
