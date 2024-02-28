<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="bitcamp.myapp.vo.Member"%>

<!DOCTYPE html>
<html lang='en'>
<head>
  <meta charset='UTF-8'>
  <title>비트캠프 데브옵스 5기</title>
</head>
<body>

<jsp:include page="/header.jsp"></jsp:include>

out.println("<h1>회원</h1>");

      out.println("<form action='/member/update' method='post' enctype='multipart/form-data'>");

      out.println("<div>");
      out.printf(
          "  사진: <a href='%s'><img src='%1$s' height='80px'></a><br> <input name='photo' type='file'>\n",
          member.getPhoto() != null ? "/upload/" + member.getPhoto() : "/img/default-photo.jpg");
      out.println("</div>");
      out.println("<div>");
      out.printf("  번호: <input readonly name='no' type='text' value='%d'>\n", member.getNo());
      out.println("</div>");
      out.println("<div>");
      out.printf("  이메일: <input name='email' type='text' value='%s'>\n", member.getEmail());
      out.println("</div>");
      out.println("<div>");
      out.printf("  이름: <input name='name' type='text' value='%s'>\n", member.getName());
      out.println("</div>");
      out.println("<div>");
      out.println("  암호: <input name='password' type='password'>");
      out.println("</div>");
      out.println("<div>");
      out.printf("  가입일: <input readonly type='text' value='%s'>\n", member.getCreatedDate());
      out.println("</div>");
      out.println("<div>");
      out.println("  <button>변경</button>");
      out.printf("  <a href='/member/delete?no=%d'>[삭제]</a>\n", no);
      out.println("</div>");
      out.println("</form>");

<jsp:include page="/footer.jsp"></jsp:include>

</body>
</html>