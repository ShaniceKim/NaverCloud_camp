package bitcamp.myapp.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserve/delete")
public class ReserveDeleteServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    try {
      // 예약 취소 처리를 수행하는 코드 추가
      // 예약 번호를 파라미터로 받아서 예약 취소 로직을 수행
      // ...

      // 예약 취소 처리 성공 시
      response.sendRedirect("/reserve/list"); // 취소 후 예약 목록 페이지로 리다이렉트

    } catch (Exception e) {
      // 예약 취소 처리 실패 시
      throw new RuntimeException(e);
    }
  }

}

