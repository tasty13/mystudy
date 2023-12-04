package com.eomcs.oop.ex02.test;

import com.eomcs.oop.ex02.test.util.Calculator;

// # 관련된 기능(메서드)을 묶어 분류하기
// 1) 분류 전 O
// 2) 메서드를 클래스로 묶어 분류하기 O
// 3) 클래스 변수 도입 O
// 4) 클래스 변수의 한계 확인 O
// 5) 인스턴스 변수 도입 O
// 6) 인스턴스 메서드 활용 O
// 7) 패키지 멤버 클래스로 분리 O

public class App {

  public static void main(String[] args) {
    // 다음 두 개의 식을 분리하여 계산해 보자!
    // - 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    System.out.printf("result = %d\n", c1.result);


    c2.plus(3);
    c2.multiple(2);
    c2.plus(7);
    c2.divide(4);
    c2.minus(5);

    System.out.printf("result = %d\n", c2.result);
  }
}


