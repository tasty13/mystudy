package algorithm.test.jcp.chap01.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static final String WHITESPACE = " ";

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    System.out.println("reverseWords: " + reverseWords(str));
    System.out.println("reverse: " + reverse(str));
  }

  static String reverseWords(String str) {
    String[] words = str.split(WHITESPACE); // 공백으로 단어와 단어 사이 나눔
    StringBuilder reversedString = new StringBuilder();

    for (String word : words) {
      StringBuilder reverseWord = new StringBuilder();

      for (int i = word.length() - 1; i >= 0; i--) {
        // 단어 맨 끝에서부터 append
        reverseWord.append(word.charAt(i));
      }
      // reversedString에 순서 변경한 단어랑 공백 append
      reversedString.append(reverseWord).append(WHITESPACE);
    }
    return reversedString.toString();

  }

  public static String reverse(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
