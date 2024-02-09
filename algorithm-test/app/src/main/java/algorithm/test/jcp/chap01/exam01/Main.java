package algorithm.test.jcp.chap01.exam01;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  // 아스키와 유니코드를 모두 지원하도록 작성한다.
  public Map<Character, Integer> countDuplicateCharacters(String str) {
    // 문자열 내 문자를 순회하며 Map을 사용해 문자를 키로, 빈도수를 값으로 저장
    Map<Character, Integer> result = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      // codePointAt: 지정된 인덱스에 있는 문자(유니코드 코드 포인트)를 반환
      // cp를 char로 바꾼 뒤 String으로 변환해줌
      int cp = str.codePointAt(i);
      String ch = String.valueOf(Character.toChars(cp));


      if (Character.charCount(cp) == 2) { // 이때 2는 대리 쌍을 뜻한다.
        i++;
      }


      // 기존 코드(특수문자를 고려하지 않음)
      //
      // char ch = str.charAt(i);
      //
      // // 현재 문자가 Map에 없으면 (character, 1) 추가, 있으면 빈도수를 1 증가시킴
      // result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    return result;
  }
}
