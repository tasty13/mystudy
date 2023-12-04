package com.eomcs.oop.ex02.step13;

// 데이터 타입 정의
// 0) 클래스 사용 전: 낱개 변수 사용
// 1) 성적 데이터를 저장할 메모리를 새로 정의:
// - '사용자 정의 데이터 타입(user-defined data type)'이라 부른다.
// - 여러 개로 이루어진 데이터를 한 묶음으로 다루면 관리하기 쉽다.
// 2) 리팩토링: 메서드 추출(extract method), static nested class

public class App {
  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();

    // - Heap 영역에 생성된 인스턴스의 변수는 레퍼런스를 통해 접근한다.
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 85;

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 80;
    s2.math = 75;

    s3.name = "유관순";
    s3.kor = 80;
    s3.eng = 70;
    s3.math = 65;

    printScore(s1);
    printScore(s2);
    printScore(s3);

  }

  // 합계와 평균, 출력 코드를 분리해 별도의 메소드로 정의
  // 즉 중복 코드를 제거해 메서드로 정의해 두면 재사용하기 쉽다.
  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}