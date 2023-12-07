package bitcamp.myapp.vo;

public class Board {

  public String title;
  public String content;
  public String writer;
  public String createdDate;

  public Board() {

  }

  public Board(String title, String content, String writer, String createdDate) {
    this.title = title;
    this.content = content;
    this.writer = writer;
    this.createdDate = createdDate;
  }

}
