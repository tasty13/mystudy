package algorithm.test.baekjoon.level06.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static int countChar(String str, String string) {
    return str.length() - str.replace(String.valueOf(string), "").length();
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();
    Set<String> set = new HashSet<String>(Arrays.asList(str.split(str)));

    List<String> strlist = List.copyOf(set);
    String[] strs = new String[set.size()];
    int[] count = new int[set.size()];

    for (int i = 0; i < set.size(); i++) {
      count[i] = countChar(str, strlist.get(i));
    }

    for (String s : strlist)
      System.out.print(s + " ");
    System.out.println();

    for (int i : count)
      System.out.print(i + " ");
    System.out.println();


    int max = 0;
    String result = null;
    for (int i = 0; i <= count.length; i++) {
      if (count[i] == max) {
        result = "?";
        break;
      }
      if (count[i] > max) {
        result = strlist.get(i);
      }
    }
    System.out.print(result);
  }
}
