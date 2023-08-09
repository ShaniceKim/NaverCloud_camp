package bitcamp.myapp.handler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserve/detail")
public class ReserveDetailServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 예약 상세 정보 조회 및 처리하는 로직 추가
    // 예약 번호를 파라미터로 받아서 예약 상세 정보를 조회하고 처리
    // ...

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>예약 상세 정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>예약 상세 정보</h1>");

    if (/* 예약 상세 정보가 null이 아닌 경우 */) {
      out.println("<form action='/reserve/update' method='post'>");
      out.println("<table border='1'>");
      // 예약 상세 정보를 출력하는 부분 추가
      // ...

      out.println("</table>");

      out.println("<div>");
      out.println("<button>변경</button>");
      out.println("<button type='reset'>초기화</button>");
      out.printf("<a href='/reserve/delete?no=%d'>취소</a>\n", /* 예약 번호 */);
      out.println("<a href='/reserve/list'>목록</a>\n");
      out.println("</div>");
      out.println("</form>");
    } else {
      out.println("<p>해당 번호의 예약 정보가 없습니다!</p>");
    }

    out.println("</body>");
    out.println("</html>");

  }
}
