package bitcamp.myapp.handler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.myapp.seat.Reserve;
import bitcamp.myapp.vo.Board;
import bitcamp.myapp.vo.Member;


@WebServlet("/reserve/add")
public class ReserveAddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Member loginUser = (Member) request.getSession().getAttribute("loginUser");
		if (loginUser == null) {
			response.sendRedirect("/auth/form.html");
			return;
		}
		
		//int category = Integer.parseInt(request.getParameter("category"));
		
//		Reserve r = new Reserve();
//		r.setTitle(request.getParameter("title"));
//		r.setContent(request.getParameter("content"));
//		r.setWriter(loginUser);
//		r.setCategory(category);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>예약</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>비트묭실 예약</h1>");

		out.println("<form action='/reserve' method='post'>");
		out.println("옵션 선택 : ");
		out.println("<select name='menu'>");
		out.println("<option value='1'>예약</option>");
		out.println("<option value='2'>조회</option>");
		out.println("<option value='3'>취소</option>");
		out.println("</select>");
		out.println("<input type='submit' value='실행'>");
		out.println("</form>");

//		try {
//			InitServlet.reserveDao.insert(r);
//			InitServlet.sqlSessionFactory.openSession(false).commit();
//			out.println("<p>예약 성공입니당</p>");
//
//		} catch (Exception e) {
//			InitServlet.sqlSessionFactory.openSession(false).rollback();
//			out.println("<p>예약 실패입니당</p>");
//			e.printStackTrace();
//		}


		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}


