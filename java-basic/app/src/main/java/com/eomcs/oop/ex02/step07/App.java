package com.eomcs.oop.ex02.step07;

import com.eomcs.oop.ex02.step07.util.Calculator;

// # 관련된 기능(메서드)을 묶어 분류하기
// 1) 분류 전
// 2) 메서드를 클래스로 묶어 분류하기
// 3) 클래스 변수 도입
// 4) 클래스 변수의 한계 확인
// 5) 인스턴스 변수 도입
// 6) 인스턴스 메서드 활용
// 7) 패키지 멤버 클래스로 분리
public class App {
  public static void main(String[] args) {

    // 다음 두 개의 식을 분리하여 계산해 보자!
    // - 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    // 다른 패키지의 클래스를 사용하려면 반드시 패키지명을 클래스 이름과 함께 지정해야 한다.
    // com.eomcs.oop.ex02.step07.util.Calculator c1 = new
    // com.eomcs.oop.ex02.step07.util.Calculator(); // => 클래스에 정의된 인스턴스 변수를 Heap 영역에 생성
    // com.eomcs.oop.ex02.step07.util.Calculator c2 = new
    // com.eomcs.oop.ex02.step07.util.Calculator();

    // import 명령을 사용하여 클래스의 패키지 이름을 미리 알려준다면
    // 클래스를 지정할 때 패키지 이름을 나열할 필요가 없다.
    Calculator c1 = new Calculator(); // => 클래스에 정의된 인스턴스 변수를 Heap 영역에 생성
    Calculator c2 = new Calculator();

    c1.plus(2);
    c2.plus(3);


    c1.plus(3);
    c2.multiple(2);

    c1.minus(1);
    c2.plus(7);

    c1.multiple(7);
    c2.divide(4);

    c1.divide(3);
    c2.minus(5);

    // result 변수가 어떤 인스턴스에 있는 변수인지 지정해야 한다.
    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);
  }


}

