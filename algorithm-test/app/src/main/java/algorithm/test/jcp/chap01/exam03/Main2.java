package algorithm.test.jcp.chap01.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main2 {
  private static final Pattern PATTERN = Pattern.compile(" +");

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    System.out.println("reverseWords: " + reverseWords(str));
    System.out.println("reverse: " + reverse(str));
  }

  static String reverseWords(String str) {
    return PATTERN.splitAsStream(str)
        .map(w -> new StringBuilder(w).reverse())
        .collect(Collectors.joining(" "));
  }

  public static String reverse(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
