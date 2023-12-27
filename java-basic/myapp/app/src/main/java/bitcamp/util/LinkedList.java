package bitcamp.util;

public class LinkedList<E> {

  private Node<E> first;
  private Node<E> last;
  private int size;

  public int size() {
    return size;
  }

  public void add(E value) {
    Node<E> node = new Node<>();
    node.value = value;

    if (last == null) {
      // 노드 객체가 없을 때
      first = last = node;
    } else {
      // 기존에 노드 객체가 있을 때, 마지막 노드의 다음 노드로 새로 만든 노드를 가리키게 한다.
      last.next = node; // last 노드의 next에 node 주소 넣음
      last = node; // last 주소를 새로 만든 노드 주소로
    }
    size++;
  }

  public Object[] toArray() {
    Object[] arr = new Object[size];
    int index = 0;
    Node<E> node = first;
    while (node != null) {
      arr[index++] = node.value;
      node = node.next;
    }
    return arr;
  }

  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("무효한 인덱스입니다.");
    }

    int cursor = 0;
    Node<E> node = first;
    while (++cursor <= index) {
      node = node.next;
    }
    return node.value;
  }

  public E set(int index, E value) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("무효한 인덱스입니다.");
    }

    int cursor = 0;
    Node<E> node = first;
    while (++cursor <= index) {
      node = node.next;
    }

    E old = node.value;
    node.value = value;
    return old;
  }

  public void add(int index, E value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("무효한 인덱스입니다.");
    }

    Node<E> node = new Node<>();
    node.value = value;

    if (first == null) {
      first = last = node;
    } else if (index == 0) {
      // index가 0일 때 -> 원래 first였던 값이랑 새 노드 연결, 새 노드를 first로
      node.next = first;
      first = node;

    } else if (index == size) {
      // index가 size일 때-> 원래 마지막 노드가 새 노드 가리키게, 새 노드를 last로
      last.next = node;
      last = node;
    } else {
      // 리스트에서 삽입할 인덱스의 바로 전 노드에 해당하는 값을 찾음
      // 얘 next 주소를 새 노드에, 얘 next에 새 노드 주소 넣어주기
      int cursor = 0;
      Node<E> currNode = first;
      while (++cursor < index) {
        currNode = currNode.next;
      }
      node.next = currNode.next;
      currNode.next = node;
    }
    size++;
  }

  public E remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("무효한 인덱스입니다.");
    }

    E old = null;  // 지워질 예정인 노드를 저장해서 리턴하기

    if (size == 1) {
      // 1개일 때
      old = first.value;
      first = last = null;

    } else if (index == 0) {
      // 맨 처음 삭제
      old = first.value;
      first = first.next;

    } else {
      int cursor = 0;
      Node<E> currNode = first;
      while (++cursor < index) {
        currNode = currNode.next;
      }
      old = currNode.next.value;
      currNode.next = currNode.next.next;

      if (index == size - 1) {
        // 마지막 node 삭제할 때 last 바꿔줌
        last = currNode;
      }
    }
    size--;
    return old;
  }

  public boolean remove(E value) {
    Node prevNode = null;
    Node node = first;

    while (node != null) {
      if (node.value.equals(value)) {
        break;
      }
      prevNode = node;
      node = node.next;
    }
    if (node == null) {
      return false;
    }

    if (node == first) {
      first = first.next; // 다음노드를 첫번째노드로. node.next를 썼을때보다 가독성이 좋다
      if (first == null) {
        last = null;
      }
    } else {
      prevNode.next = node.next;
    }

    size--;
    return true;
  }

  private static class Node<E> {

    E value;
    Node<E> next;
  }
}
