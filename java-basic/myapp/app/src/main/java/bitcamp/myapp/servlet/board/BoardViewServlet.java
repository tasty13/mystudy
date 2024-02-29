package bitcamp.myapp.servlet.board;

import bitcamp.myapp.dao.AttachedFileDao;
import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.AttachedFile;
import bitcamp.myapp.vo.Board;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/view")
public class BoardViewServlet extends HttpServlet {

  private BoardDao boardDao;
  private AttachedFileDao attachedFileDao;

  @Override
  public void init() {
    this.boardDao = (BoardDao) this.getServletContext().getAttribute("boardDao");
    this.attachedFileDao = (AttachedFileDao) this.getServletContext()
        .getAttribute("attachedFileDao");
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String title = "";

    try {

      int no = Integer.parseInt(request.getParameter("no"));

      Board board = boardDao.findBy(no);
      if (board == null) {
        throw new Exception("번호가 유효하지 않습니다.");
      }

      int category = Integer.valueOf(request.getParameter("category"));
      title = category == 1 ? "게시글" : "가입인사";

      request.setAttribute("category", Integer.valueOf(request.getParameter("category")));
      request.setAttribute("boardName", category == 1 ? "게시글" : "가입인사");

      request.setAttribute("board", board);
      request.setAttribute("files", attachedFileDao.findAllByBoardNo(no));
      request.setAttribute("viewUrl", "/board/view.jsp");

    } catch (Exception e) {
      request.setAttribute("exception", e);
    }
  }
}
