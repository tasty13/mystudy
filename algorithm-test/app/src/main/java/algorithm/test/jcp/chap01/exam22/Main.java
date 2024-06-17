package algorithm.test.jcp.chap01.exam22;

// 가장 긴 공통 접두사 찾기
public class Main {
  public static void main(String[] args) {
    String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};
    System.out.println(getPrefix(texts));

  }

  public static String getPrefix(String[] strs) {
    // 배열의 길이가 1이면 공통 접두사는 첫번째 문자열
    if (strs.length == 1) {
      return strs[0];
    }

    // 첫 번째 문자열의 길이 저장
    int firstLen = strs[0].length();

    // 첫 번쨰 문자열 길이만큼 반복
    for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
      // 첫 번째 문자열의 각 문자에 대해 반복, prefixLen은 접두사의 길이 셈
      // 첫 번째 문자열의 각 문자 ch 가져옴
      char ch = strs[0].charAt(prefixLen);

      for (int i = 1; i < strs.length; i++) {
        // 접두사의 길이(prefixLen)가 다른 문자열의 길이보다 길거나 같은 경우 또는 해당 위치의 문자가 다른 경우
        // -> 공통 접두사 끝남 -> 현재까지의 접두사 반환
        if (prefixLen >= strs[i].length() || strs[i].charAt(prefixLen) != ch) {
          return strs[i].substring(0, prefixLen);
        }
      }
    }

    return strs[0]; // 전체 루프 끝나면 첫 번째 문자열이 공통 문자열
  }
}
