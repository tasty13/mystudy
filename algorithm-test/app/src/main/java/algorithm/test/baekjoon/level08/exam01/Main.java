package algorithm.test.baekjoon.level08.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    System.out.println(Integer.parseInt(st.nextToken(), Integer.parseInt(st.nextToken())));

    // System.in.read로 받기: ' '랑 '\n' 나올때까지
    // 이거 >> 이용해서 받는거 공부하기
    // 해당문자 변환하고 자릿수 따라 해당진법 *하기: ' ' 나올때까지 sum+=35(Z) sum+=35(Z)*36 ...
    // char int로 변환한게 A면 7을 더 빼주나... (39-> 9 , 3A~40 다른문자, 41-> A)

  }
}
