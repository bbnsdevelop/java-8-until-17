package br.com.bbnsdevelop.interceptingfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class UserAgentFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String userAgenteHeader = ((HttpServletRequest)request).getHeader("User-Agent");
		
		System.out.println(userAgenteHeader);
		
		if(userAgenteHeader.contains("Chrome")) {
			chain.doFilter(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("badBrowser.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
