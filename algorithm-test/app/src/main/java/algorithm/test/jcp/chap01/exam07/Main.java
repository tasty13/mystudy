package algorithm.test.jcp.chap01.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer integer = toInteger(br.readLine());
    if (integer != 0) {
      System.out.println(integer);
    }
  }

  // String -> int, long, float, double : parseXxxx()
  // String -> Integer, Long, Float, Double : Xxxx.valueOf()

  // String -> Integer
  public static int toInteger(String str) {
    try {
      Integer toInt = Integer.valueOf(str);
      return toInt;
    } catch (NumberFormatException e) {
      System.err.println(e);
    }
    return 0;
  }

  // String -> Long
  public static long toLong(String str) {
    try {
      Long toLong = Long.valueOf(str);
      return toLong;
    } catch (NumberFormatException e) {
      System.err.println(e);
    }
    return 0;
  }

  // String -> Float
  public static float toFloat(String str) {
    try {
      Float toFloat = Float.valueOf(str);
      return toFloat;
    } catch (NumberFormatException e) {
      System.err.println(e);
    }
    return 0;
  }

  // String -> Double
  public static double toDouble(String str) {
    try {
      Double toDouble = Double.valueOf(str);
      return toDouble;
    } catch (NumberFormatException e) {
      System.err.println(e);
    }
    return 0;
  }
}
