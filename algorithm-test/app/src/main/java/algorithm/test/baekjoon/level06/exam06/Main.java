package algorithm.test.baekjoon.level06.exam06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    // 특수문자 나올때까지 읽음-> String에 해당문자 포함되면 거기까지 잘라서 숫자세고 다시하나
    // 근데이거검사어케함

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] alps = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", " z="};

    // String 배열길이만큼 돌려서 얘잇으면 얘를 한글자로치면될거같은데
    for (String s : alps) {
      if (str.contains(s)) {
        str.//dkslrsesr아닉ㄴㄷㄴㄱㅁㅇㅊㄴㄻㄴㅇ
      }
    }

    System.out.println(str);
  }
}
