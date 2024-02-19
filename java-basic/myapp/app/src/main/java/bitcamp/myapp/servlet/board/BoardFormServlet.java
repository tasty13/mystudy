package bitcamp.myapp.servlet.board;

import bitcamp.myapp.dao.AttachedFileDao;
import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.dao.mysql.AttachedFileDaoImpl;
import bitcamp.myapp.dao.mysql.BoardDaoImpl;
import bitcamp.myapp.vo.AttachedFile;
import bitcamp.myapp.vo.Board;
import bitcamp.util.DBConnectionPool;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/form")
public class BoardFormServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    int category = Integer.parseInt(request.getParameter("category"));
    String title = category == 1 ? "게시글" : "가입인사";

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html lang='en'>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>비트캠프 데브옵스 5기</title>");
    out.println("</head>");
    out.println("<body>");
    out.printf("<h1>%s</h1>", title);

    out.printf("<form action='/board/add?category=%d'>\n", category);
    out.printf("<input name='category' type='text' value='%d'>\n", category);
    out.printf("  <div>");
    out.printf("    제목: <input name=title' type='text'>");
    out.printf("  </div>");
    out.printf("  <div>");
    out.printf("        내용: <textarea name='content'></textarea>");
    out.printf("  </div>");

    if (category == 1) {
      out.printf("  <div>");
      out.printf("        첨부파일: <input multiple name='files' type='file'>");
      out.printf("  </div>");
    }
    
    out.printf("  <div>");
    out.printf("    <button>등록</button>");
    out.printf("  </div>");
    out.printf("</form>");

    out.println("</body>");
    out.println("</html>");
  }
}
