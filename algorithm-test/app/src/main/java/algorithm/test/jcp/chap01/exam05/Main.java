package algorithm.test.jcp.chap01.exam05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 모음과 자음 세기
public class Main {
  private static final Set<Character> allVowels =
      new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

  public static void main(String[] args) {

  }

  // Pair 사용 -> apache commons 라이브러리 사용
  public static Pair<Integer, Integer> countVowelsAndConsonants(String str) {
    str = str.toLowerCase();
    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (allVowels.contains(ch)) {
        vowels++;
      } else if ((ch >= 'a' && ch <= 'z')) {
        consonants++;
      }
    }
    return Pair.of(vowels, consonants);
  }

}
