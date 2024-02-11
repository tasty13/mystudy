package algorithm.test.jcp.chap01.exam01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main {
    

  private static final String TEXT = "Be strong, be fearless, be beautiful. "
          + "And believe that anything is possible when you have the right "
          + "people there to support you. ";
  // Ӝ -> Unicode: \u04DC, Code Point: 1244
  // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
  // 🎼 -> \uD83C\uDFBC, Code Point: 127932
  // 😍 ->\uD83D\uDE0D, Code Point: 128525
  private static final String TEXT_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";

  public static void main(String[] args) throws Exception {
    System.out.println("Input text: \n" + TEXT + "\n");

    System.out
        .println("\n\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");

    System.out.println("HashMap based solution:");
    long startTimeV1 = System.nanoTime();

    Map<Character, Integer> duplicatesV1 = Strings.countDuplicateCharactersV1(TEXT);

    displayExecutionTime(System.nanoTime() - startTimeV1);
    System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));
    // or: duplicatesV1.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

    System.out.println();
    System.out.println("Java 8, functional-style solution:");
    long startTimeV2 = System.nanoTime();

    Map<Character, Long> duplicatesV2 = Strings.countDuplicateCharactersV2(TEXT);

    displayExecutionTime(System.nanoTime() - startTimeV2);
    System.out.println(Arrays.toString(duplicatesV2.entrySet().toArray()));
    // or: duplicatesV2.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

    System.out.println("\n--------------------------------------\n");
    System.out.println("Input text: \n" + TEXT_CP + "\n");
    System.out.println("\n\nIncluding Unicode surrogate pairs examples:\n");
    System.out.println("HashMap based solution:");
    long startTimeV3 = System.nanoTime();

    Map<String, Integer> duplicatesV3 = Strings.countDuplicateCharactersVCP1(TEXT_CP);

    displayExecutionTime(System.nanoTime() - startTimeV3);
    System.out.println(Arrays.toString(duplicatesV3.entrySet().toArray()));
    // or: duplicatesV3.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

    System.out.println();
    System.out.println("Java 8, functional-style solution:");
    long startTimeV4 = System.nanoTime();

    Map<String, Long> duplicatesV4 = Strings.countDuplicateCharactersVCP2(TEXT_CP);

    displayExecutionTime(System.nanoTime() - startTimeV4);
    System.out.println(Arrays.toString(duplicatesV4.entrySet().toArray()));
    // or: duplicatesV4.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));
  }

  private static void displayExecutionTime(long time) {
    System.out.println("Execution time: " + time + " ns" + " ("
        + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
  }
}


//  // 아스키와 유니코드를 모두 지원하도록 작성한다.
//  public static Map<Character, Integer> countDuplicateCharacters(String str) {
//    // 문자열 내 문자를 순회하며 Map을 사용해 문자를 키로, 빈도수를 값으로 저장
//    Map<Character, Integer> result = new HashMap<>();
//    for (int i = 0; i < str.length(); i++) {
//      // codePointAt: 지정된 인덱스에 있는 문자(유니코드 코드 포인트)를 반환
//      // cp를 char로 바꾼 뒤 String으로 변환해줌
//      int cp = str.codePointAt(i);
//      String ch = String.valueOf(Character.toChars(cp));
//
//      if (Character.charCount(cp) == 2) { // 이때 2는 대리 쌍을 뜻한다.
//        i++;
//      }
//
//      // 기존 코드(특수문자를 고려하지 않음)
//      // char ch = str.charAt(i);
//
//      // 현재 문자가 Map에 없으면 (character, 1) 추가, 있으면 빈도수를 1 증가시킴
//      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
//    }
//    return result;
//  }
//}
