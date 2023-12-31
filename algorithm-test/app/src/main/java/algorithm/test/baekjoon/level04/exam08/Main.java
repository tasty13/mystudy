package algorithm.test.baekjoon.level04.exam08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer[] arr = new Integer[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine()) % 42;
    }
    Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
    System.out.println(set.size());
  }
}
