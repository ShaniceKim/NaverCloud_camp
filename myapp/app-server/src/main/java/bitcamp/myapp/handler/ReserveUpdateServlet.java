package bitcamp.myapp.handler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reserve/update")
public class ReserveUpdateServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 예약 정보 업데이트 처리
    int reservationNo = Integer.parseInt(request.getParameter("no"));
    // 여기에서 필요한 예약 정보를 읽어온 후 Reservation 객체에 설정

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta http-equiv='refresh' content='1;url=/reserve/list'>");
    out.println("<title>예약</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>예약 변경</h1>");

    try {
      // 예약 정보 업데이트 로직
      // if (예약 정보 업데이트 메서드) {
      //   InitServlet.sqlSessionFactory.openSession(false).commit();
      //   out.println("<p>변경했습니다!</p>");
      // } else {
      //   out.println("<p>예약 정보를 찾을 수 없습니다.</p>");
      // }

    } catch (Exception e) {
      // 예약 정보 업데이트 실패 시 처리
      // InitServlet.sqlSessionFactory.openSession(false).rollback();
      // out.println("<p>변경 실패입니다!</p>");
      // e.printStackTrace();
    }

    out.println("</body>");
    out.println("</html>");
  }

}
