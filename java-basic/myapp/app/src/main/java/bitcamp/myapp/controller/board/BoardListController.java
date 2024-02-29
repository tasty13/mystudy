package bitcamp.myapp.controller.board;

import bitcamp.myapp.controller.PageController;
import bitcamp.myapp.dao.BoardDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list")
public class BoardListController implements PageController {

  private BoardDao boardDao;

  public BoardListController(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    String title = "";

    int category = Integer.valueOf(request.getParameter("category"));
    title = category == 1 ? "게시글" : "가입인사";

    request.setAttribute("category", Integer.valueOf(request.getParameter("category")));
    request.setAttribute("boardName", category == 1 ? "게시글" : "가입인사");

    request.setAttribute("list", boardDao.findAll(category));
    return "/board/list.jsp";
  }
}
