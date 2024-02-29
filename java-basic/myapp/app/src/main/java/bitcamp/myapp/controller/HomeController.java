package bitcamp.myapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController implements PageController {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws Exception {

    return "/home.jsp";
  }
}
