package bitcamp.menu;

// 메뉴를 실행시킬 때 작업을 수행할 객체 사용 규칙 정의
// 메뉴 실행-> 해당 메뉴는 등록된 MenuHandler 객체를 실행
public interface MenuHandler {

  // 사용자가 메뉴를 선택하면 MenuItem 객체는 다음 규칙에 따라 메서드 호출할 것
  public abstract void action();
}
