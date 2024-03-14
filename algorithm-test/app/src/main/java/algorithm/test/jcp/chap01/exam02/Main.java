package algorithm.test.jcp.chap01.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char notdup1st = firstNonRepeatedCharacter(br.readLine());
    System.out.println(notdup1st);
  }

  public static char firstNonRepeatedCharacter(String str) {
    // LinkedHashMap-> 삽입 순서를 유지하는 맵.
    // 문자=key, 빈도수=value
    Map<Character, Integer> chars = new LinkedHashMap<>();

    for (char c : str.toCharArray()) {
      // char.compute()-> 첫 번째 전달 인자는 키값, 두 번째 인자는 람다식
      // 키값의 value가 null이면 v==1, 아닐 시 v값에 1 더해줌
      chars.compute(c, (k, v) -> (v == null) ? 1 : ++v);
    }

    // value(빈도수)가 1인 첫 번째 key 반환
    for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return Character.MIN_VALUE;
  }
}
