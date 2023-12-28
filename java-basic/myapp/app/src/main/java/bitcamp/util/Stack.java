package bitcamp.util;

public class Stack<E> extends LinkedList<E> {

  public E push(E value) {
    this.add(value);
    return value;
  }

  public E pop() {
    // last 꺼내고 그 전 노드를 last로
    return this.remove(this.size() - 1);
  }

  public E peek() {
    // last 출력
    return this.get(this.size() - 1);
  }

  public boolean empty() {
    return this.size() == 0;
  }
}
