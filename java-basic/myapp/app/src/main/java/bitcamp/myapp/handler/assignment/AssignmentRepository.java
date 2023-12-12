package bitcamp.myapp.handler.assignment;

import bitcamp.myapp.vo.Assignment;

public class AssignmentRepository {

  private Assignment[] assignments = new Assignment[3];
  private int length = 0;

  public void add(Assignment assignment) {
    if (this.length == this.assignments.length) {
      int oldSize = this.assignments.length;
      int newSize = oldSize + (oldSize >> 1);

      // 이전 배열에 들어 있는 값을 새 배열에 복사
      Assignment[] arr = new Assignment[newSize];
      for (int i = 0; i < oldSize; i++) {
        arr[i] = this.assignments[i];
      }
      // 새 배열을 가리키도록 배열 레퍼런스를 변경
      this.assignments = arr;
    }

    this.assignments[this.length++] = assignment;
  }

  public Assignment remove(int index) {
    if (index < 0 || index >= this.length) {
      return null;
    }

    Assignment assignment = this.assignments[index];

    for (int i = index; i < (this.length - 1); i++) {
      // 다음 레퍼런스의 값을 삭제하려는 현재 레퍼런스로 이동
      this.assignments[i] = this.assignments[i + 1];
    }
    this.assignments[--this.length] = null;

    return assignment;
  }

  public Assignment[] toArray() {
    Assignment[] arr = new Assignment[this.length];
    for (int i = 0; i < length; i++) {
      arr[i] = assignments[i];
    }
    return arr;
  }

  public Assignment get(int index) {
    if (index < 0 || index >= this.length) {
      return null;
    }
    return this.assignments[index];
  }

  public Assignment set(int index, Assignment assignment) {
    if (index < 0 || index >= this.length) {
      System.out.println("과제 번호가 유효하지 않습니다.");
      return null;
    }
    Assignment old = assignments[index];
    assignments[index] = assignment;
    return old;
  }
}
