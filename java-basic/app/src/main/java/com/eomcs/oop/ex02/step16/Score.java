package com.eomcs.oop.ex02.step16;

public class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  // 인스턴스 메서드 = non-static 메서드
  // - 메서드를 호출할 때 인스턴스의 주소를 파라미터로 넘기지 않는다.
  // - 메서드를 호출할 때(연산자를 사용할 때), 메서드 앞에 인스턴스 주소를 적는다.
  // - 이렇게 전달된 인스턴스 주소는 메서드에 내장된 this라는 변수에 자동 저장된다.
  // - 그래서 파라미터 대신 this를 사용하면 된다.
  // - 인스턴스 메서드는 static을 붙이지 않는다.
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
  // compute() 메서드는 Score 데이터를 다루는 메서드이다.
  // 즉 Score 타입의 데이터를 다룰 수 있는 '연산자'라고 할 수 있음
  // - 사용자 정의 데이터 타입 입장에서는 그 데이터를 다루는 메서드가 연산자 역할을 한다.
  // - 즉 사용자 정의 데이터 타입에 메서드를 정의하는 것은
  // 그 데이터를 다룰 연산자를 정의하는 것과 같다.
}
