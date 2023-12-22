// StringBuffer vs. StringBuilder
package com.eomcs.basic.ex02;

public class Exam0164 {
  public static void main(String[] args) throws Exception {
    // 하나의 스레드로 이어서 작업-> Builder (한 작업 할 동안 다른 작업 막지 않음, 계속 append)
    // 여러 개의 스레드로 동시에 작업-> Buffer (한 작업 할 동안 다른 작업 막음)
    // Builder가 Buffer보다 빠르다. (잠그고 푸는 일 안하니까 더 빠름)
    StringBuilder buf = new StringBuilder(); // safe for use by multiple threads (각각 동시에 작업)
    // StringBuilder builder = new StringBuilder(); // with no guarantee of synchronization

    Worker w1 = new Worker(buf, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    Worker w2 = new Worker(buf, "--------------------------------------------------");
    Worker w3 = new Worker(buf, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    Worker w4 = new Worker(buf, "**************************************************");

    // 순차적으로 작업시키지 않고 동시에 진행한다.
    // -> Thread 객체에 대해 start()를 호출하면 run() 메서드를 실행시키고 즉시 리턴한다.
    // -> 즉 run() 메서드의 작업이 끝날 때까지 기다리지 않는다.
    w1.start();
    w2.start();
    w3.start();
    w4.start(); // w1 ~ w4 중 어떤놈이 먼저끝날지 모름

    // 이전에 실행시킨 작업이 끝날 때까지 2초 정도 기다렸다가 다음 명령 실행
    Thread.currentThread().sleep(2000);
    System.out.println("실행 끝!");
    System.out.println(buf.length());
  }

  // 하는 일: 주어진 메시지를 버퍼에 100번 담는 일
  static class Worker extends Thread {
    String message;
    StringBuilder buf;

    public Worker(StringBuilder buf, String message) {
      this.buf = buf;
      this.message = message;
    }

    @Override
    public void run() {
      for (int i = 0; i < 100; i++) {
        buf.append(message); // 작업 하나 끝날때까지 기다림
      }
      System.out.printf("'%s' 메시지 저장 끝!\n", message);
    }
  }
}


