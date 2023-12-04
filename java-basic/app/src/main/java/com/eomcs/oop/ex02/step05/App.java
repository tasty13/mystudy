package com.eomcs.oop.ex02.step05;

// # 관련된 기능(메서드)을 묶어 분류하기
// 1) 분류 전
// 2) 메서드를 클래스로 묶어 분류하기
// 3) 클래스 변수 도입
// 4) 클래스 변수의 한계 확인
// 5) 인스턴스 변수 도입
//
public class App {

  public static void main(String[] args) {

    // 다음 두 개의 식을 분리하여 계산해 보자!
    // - 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    // 두 개의 식을 동시에 계산하고 싶은가?
    // 그럴려면 계산 결과를 개별적으로 관리할 수 있어야 한다.
    // 다음과 같이 각 식의 계산 결과를 보관할 메모리를 준비한다.

    // 클래스 변수는 오직 한 개만 존재하기 때문에
    // 여러 개의 작업을 동시에 진행할 수 없다.
    // 한 개의 식을 계산한 후에 다른 식을 순차적으로 계산해야 한다.

    Calculator c1 = new Calculator(); // => 클래스에 정의된 인스턴스 변수를 Heap 영역에 생성
    Calculator c2 = new Calculator();

    // 계산을 수행할 떄 어떤 result 변수를 사용할지 메서드에 알려줘야 한다.
    Calculator.plus(c1, 2);
    // 식2 계산:
    // 각각의 계산식의 결과는 서로 다른 result 변수에 보관되기 때문에
    // 새로 초기화시킬 필요가 없다.
    Calculator.plus(c2, 3);

    Calculator.plus(c1, 3);
    Calculator.multiple(c2, 2);

    Calculator.minus(c1, 1);
    Calculator.plus(c2, 7);

    Calculator.multiple(c1, 7);
    Calculator.divide(c2, 4);

    Calculator.divide(c1, 3);
    Calculator.minus(c2, 5);

    // result 변수가 어떤 인스턴스에 있는 변수인지 지정해야 한다.
    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);
  }
}

