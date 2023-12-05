package com.eomcs.oop.ex02.step18;

import com.eomcs.oop.ex02.step18.vo.Score;

// 0) 낱개 변수 사용
// 1) 성적 데이터를 저장할 사용자 정의 데이터 타입을 만든다.
// 2) 리팩토링: 메서드 추출(extract method), static nested class
// 3) 리팩토링: 메서드 추출(extract method) = 한 개의 메서드는 한 개의 기능을 수행해야 한다.
// 4) GRASP(General Responsibility Assignment Software Patterns) 패턴
// => Information Expert: 데이터를 다룰 때는 그 데이터를 갖고 있는 객체에게 묻는다.
// 리팩토링: 메서드 이동(Move Method)
// => 메서드를 관련된 클래스로 이동시킨다. => 코드의 이해가 쉽다.
//
public class App {
  public static void main(String[] args) {

    // 1) Score 설계도(클래스 정의)에 따라 인스턴스 변수를 Heap 영역에 만듦
    // 2) 생성자 호출
    // - 생성자에 넘겨주는 아규먼트의 타입과 개수, 순서에 따라 호출할 생성자 결정
    // - 만약 해당 아규먼트를 받을 수 있는 생성자가 없다면 컴파일 오류
    Score s1 = new Score("홍길동", 100, 90, 85);
    Score s2 = new Score("임꺽정", 90, 80, 75);
    Score s3 = new Score("유관순", 80, 70, 65);

    // 변수 값 바뀌면 명시적으로 compute()를 호출해 합계와 평균 다시 계산
    s2.kor = 100;
    s2.compute();

    printScore(s1);
    printScore(s2);
    printScore(s3);

  }

  // printScore는 출력 기능만 담당하도록 변경
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

}
