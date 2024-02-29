package bitcamp.myapp.servlet.board;

import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.Board;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {

  private BoardDao boardDao;

  @Override
  public void init() {
    this.boardDao = (BoardDao) this.getServletContext().getAttribute("boardDao");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String title = "";
    try {
      int category = Integer.valueOf(request.getParameter("category"));
      title = category == 1 ? "게시글" : "가입인사";

      request.setAttribute("category", Integer.valueOf(request.getParameter("category")));
      request.setAttribute("boardName", category == 1 ? "게시글" : "가입인사");

      request.setAttribute("list", boardDao.findAll(category));
      request.setAttribute("viewUrl", "/board/list.jsp");

    } catch (Exception e) {
      request.setAttribute("exception", e);
    }
  }
}
