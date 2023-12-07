package bitcamp.util;

import java.io.InputStream;
import java.util.Scanner;

public class Prompt {

  Scanner keyIn;
  // 원래 new Scanner(System.in)으로 결정했는데 생성자에서 파라미터로 InputStream 받아줌으로써 타입을 좀 더 자유롭게 결정할 수 있다.

  public Prompt(InputStream in) {
    keyIn = new Scanner(in);
  }

  public String input(String title, Object... args) {
    System.out.print(String.format(title, args));
    return this.keyIn.nextLine();
  }

  public int inputInt(String title, Object... args) {
    String str = this.input(title, args);
    return Integer.parseInt(str);
  }

  public float inputFloat(String title, Object... args) {
    String str = this.input(title, args);
    return Float.parseFloat(str);
  }

  public boolean inputBoolean(String title, Object... args) {
    String str = this.input(title, args);
    return Boolean.parseBoolean(str);
  }

  public void close() {
    this.keyIn.close();
  }
}
