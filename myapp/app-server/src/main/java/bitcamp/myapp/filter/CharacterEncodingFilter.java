package bitcamp.myapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*")
public class CharacterEncodingFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException, ServletException {
		
		System.out.println("CharacterEncodingFilter 실행되었습니다!");
		//체인에 연결된 다음 작업
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
	}
	

}
