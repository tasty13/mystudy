package com.eomcs.oop.ex02.step15;

public class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  // GRASP 패턴의 'Information Expert' 설계 기법 적용
  static void compute(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }
  // compute() 메서드는 Score 데이터를 다루는 메서드이다.
  // 즉 Score 타입의 데이터를 다룰 수 있는 '연산자'라고 할 수 있음
  // - 사용자 정의 데이터 타입 입장에서는 그 데이터를 다루는 메서드가 연산자 역할을 한다.
  // - 즉 사용자 정의 데이터 타입에 메서드를 정의하는 것은
  // 그 데이터를 다룰 연산자를 정의하는 것과 같다.
}
