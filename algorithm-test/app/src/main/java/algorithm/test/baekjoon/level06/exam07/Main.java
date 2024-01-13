package algorithm.test.baekjoon.level06.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    for (int i = 0; i < num; i++) {
      String[] input = br.readLine().split("");
      String[] strarr = new String[input.length];
      List<String> list = new ArrayList<>();

      for (String s : input) {
        if (list.contains(s)) {
          // 리스트에 s 존재할 경우
          // 만약 리스트 길이 - s 인덱스가 1 이상일 경우 for문 나감
          // 아닐 시 계속 진행
          // 만약 마지막 요소일경우 테스트 통과 시 그룹단어개수 +1
          if (list.size() - 1 - list.indexOf(s) >= 1) {

          }
        } else if (list.indexOf(s) == list.size() - 1) {
          // 만약 모든 테스트 통과하면 그룹단어개수 +1
        } else {
          // 만약 리스트에 s 존재하지 않으면 리스트에 추가
          // 만약 마지막 요소일경우 그룹단어개수 +1
        }
      }

    }

  }
}
