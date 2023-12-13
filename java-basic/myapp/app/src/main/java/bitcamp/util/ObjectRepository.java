package bitcamp.util;

import java.util.Arrays;

// 게시글 데이터를 보관하는 일을 한다.
public class ObjectRepository<E> {

  // private - 목록을 저장하는 코드를 외부에서 볼 수 없게 감춘다.
  // 수퍼 클래스의 레퍼런스는 서브 클래스의 인스턴스 주소를 담을 수 있다.
  private Object[] objects = new Object[3];
  private int length = 0;

  // 대신 목록에 값을 추가하거나 꺼내거나 삭제하려면 메서드를 통해 수행하도록 유도-> '캡슐화'
  // 배열에 객체를 추가하는 부분을 메서드로 감춘다. -> 캡슐화한다.
  public void add(E object) {
    if (this.length == this.objects.length) {
      int oldSize = this.objects.length;
      int newSize = oldSize + (oldSize >> 1);

//      Object[] arr = new Object[newSize];
//      System.arraycopy(this.objects, 0, arr, 0, oldSize);
//      // this.objects가 src, 0부터, arr이 목적지, 0부터, 배열 크기: oldSize

      this.objects = Arrays.copyOf(this.objects, newSize);

      System.out.println("새 배열 크기: " + this.objects.length);
//      this.objects = arr;
    }

    this.objects[this.length++] = object;
  }

  public E remove(int index) {
    if (index < 0 || index >= this.length) {
      return null;
    }

    // 배열에서 삭제하기 전에 입시 보관해 둔다.
    Object deleted = this.objects[index];
    System.arraycopy(this.objects, index + 1, this.objects, index, this.length - (index + 1));
    this.objects[--this.length] = null;

    // 삭제한 객체를 return (받아서 쓰던가 말던가 호출하는 쪽에서 알아서 해라.)
    return (E) deleted;
  }

  public Object[] toArray() {
    return Arrays.copyOf(this.objects, this.length);
  }

  public E[] toArray(E[] arr) {
    if (arr.length >= this.length) {
      System.arraycopy(this.objects, 0, arr, 0, this.length);
      return arr;
    }
    return (E[]) Arrays.copyOf(this.objects, this.length, arr.getClass());
//    for (int i = 0; i < this.length; i++) {
//      arr[i] = (E) this.objects[i];
//    }
  }

  public E get(int index) {
    if (index < 0 || index >= this.length) {
      System.out.println("게시글 번호가 유효하지 않습니다.");
      return null;
    }
    return (E) this.objects[index];
  }

  public E set(int index, E object) {
    if (index < 0 || index >= this.length) {
      System.out.println("게시글 번호가 유효하지 않습니다.");
      return null;
    }
    Object old = this.objects[index];
    this.objects[index] = object;

    // 새 객체로 교체하기 전에 이전 객체 리턴함
    // 호출하는 쪽에서 받아 쓰거나 말거나 알아서 해라.
    return (E) old;
  }

  public int size() {
    return this.length;
  }
}
