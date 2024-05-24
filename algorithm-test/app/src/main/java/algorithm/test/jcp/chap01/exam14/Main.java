package algorithm.test.jcp.chap01.exam14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  private static final int EXTENDED_ASCII_CODES = 256;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Pair<Character, Integer> pair = br.readLine();
  }

  public static Pair<Character, Integer> findChar(String str) {
    int maxOccur = -1;
    char maxChar = Character.MIN_VALUE;

    char[] chStr = str.toCharArray();
    int[] asciiCodes = new int[EXTENDED_ASCII_CODES];

    for (int i = 0; i < chStr.length; i++) {
      char current = chStr[i];
      if (!Character.isWhitespace(current)) {
        int code = current;
        asciiCodes[code]++;

        if (asciiCodes[code] > maxOccur) {
          maxOccur = asciiCodes[code];
          maxChar = current;
        }

      }
    }
    return Pair.of(maxChar, maxOccur);
  }

}
