package bitcamp.myapp;

import bitcamp.myapp.menu.MainMenu;
import bitcamp.util.Prompt;

public class App {

  // 애플리케이션 객체 App 실행할 떄 다음 변수를 미리 준비해 둔다.
  // -> 속도 빨라짐!
  public static void main(String[] args) {
    Prompt prompt = new Prompt(System.in);  // 여기서 prompt 타입 결정해서 쭉 사용하도록 해줌
    new MainMenu(prompt).execute();
    prompt.close(); // Prompt쪽에서 keyIn 자원해제(close)시키도록 함. (참견X)
  }
}
