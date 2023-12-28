package bitcamp.util;

public class QueueTest {

  public static void main(String[] args) {
    Queue<String> queue = new Queue<>();
    System.out.println(queue.peek());
    
    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    queue.offer("ddd");

    System.out.println(queue.peek());

    while (queue.size() > 0) {
      System.out.println(queue.poll());
    }
  }
}
