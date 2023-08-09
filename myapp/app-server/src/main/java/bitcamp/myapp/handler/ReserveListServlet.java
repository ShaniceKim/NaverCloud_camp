package bitcamp.myapp.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserve/list")
public class ReserveListServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 예약 정보를 조회하는 로직 추가
    // 예: List<Reservation> reservationList = 예약 정보 조회 로직();

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>예약 목록</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>예약 목록</h1>");
    out.println("<div style='margin:5px;'>");
    out.println("<a href='/reserve/form.html'>새 예약</a>");
    out.println("</div>");
    out.println("<table border='1'>");
    out.println("<thead>");
    out.println("  <tr><th>번호</th> <th>이름</th> <th>날짜</th></tr>");
    out.println("</thead>");

    // 예약 정보를 테이블에 출력하는 부분 추가
    // for (Reservation reservation : reservationList) {
    //   out.printf("<tr>"
    //       + " <td>%d</td>"
    //       + " <td><a href='/reserve/detail?no=%d'>%s</a></td>"
    //       + " <td>%s</td></tr>\n",
    //       reservation.getNo(), reservation.getNo(), reservation.getName(), reservation.getDate());
    // }

    out.println("</tbody>");
    out.println("</table>");
    out.println("<a href='/'>메인</a>");
    out.println("</body>");
    out.println("</html>");
  }

}
