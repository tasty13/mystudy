package bitcamp.util;

public class StackTest {

  public static void main(String[] args) {
    Stack<Object> stack = new Stack<>();
    System.out.println(stack.empty());

    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    stack.push("ddd");
    System.out.println(stack.peek());

    while (!stack.empty()) {
      System.out.println(stack.pop());
    }

    System.out.println(stack.empty());
  }

}
