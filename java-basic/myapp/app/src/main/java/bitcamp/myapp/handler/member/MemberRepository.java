package bitcamp.myapp.handler.member;

import bitcamp.myapp.vo.Member;

public class MemberRepository {

  private Member[] members = new Member[3];
  private int length = 0;

  public void add(Member member) {
    if (this.length == this.members.length) {
      int oldSize = this.members.length;
      int newSize = oldSize + (oldSize >> 1);

      Member[] arr = new Member[newSize];
      for (int i = 0; i < oldSize; i++) {
        arr[i] = this.members[i];
      }
      this.members = arr;
    }
    this.members[this.length++] = member;
  }

  public Member remove(int index) {
    if (index < 0 || index >= this.length) {
      return null;
    }
    Member deleted = members[index];

    for (int i = index; i < (this.length - 1); i++) {
      this.members[i] = this.members[i + 1];
    }
    this.members[--this.length] = null;
    return deleted;
  }

  public Member[] toArray() {
    Member[] arr = new Member[this.length];
    for (int i = 0; i < this.length; i++) {
      arr[i] = members[i];
    }
    return arr;
  }

  public Member get(int index) {
    if (index < 0 || index >= this.length) {
      return null;
    }
    return members[index];
  }

  public Member set(int index, Member member) {
    // index랑 member 받음 -> index 유효한지 검사 -> 이전 member 저장-> 새 member 받아서 바꿔줌 -> 이전멤버 return
    if (index < 0 || index >= this.length) {
      System.out.println("회원 번호가 유효하지 않습니다.");
      return null;
    }
    Member oldMember = members[index];
    members[index] = member;

    return oldMember;
  }
}
