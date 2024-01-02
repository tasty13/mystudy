// anonymous class - 익명 클래스가 놓이는 장소: 스태틱 필드
package com.eomcs.oop.ex11.e;

public class Exam0410 {
  // 인터페이스의 경우 static으로 선언하지 않아도 스태틱 멤버에서 사용할 수 있다.
  interface A {
    void print();
  }

  // 스태틱 필드의 값을 준비할 때 익명 클래스를 사용할 수 있다.
  static A obj = new A() {
    @Override
    public void print() {
      System.out.println("Hello!");
    }
  };

  // 컴파일할 때 위의 문장은 다음의 문장으로 변환된다.

//  static class Exam0410$1 extends A {
//    @Override
//    public void print() {
//      System.out.println("Hello!");
//    }
//  }
//
//  static A obj;
//  static int v1;
//  public Exam0410() {
//    this.obj = new A();
//    v1 = 100;
//  }
}
