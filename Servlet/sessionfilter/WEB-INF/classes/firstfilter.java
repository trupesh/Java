
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.concurrent.*;
public class firstfilter implements Filter
{
	public void init(FilterConfig arg) throws ServletException {
		//overridden init() method
		
	}
	public void doFilter(ServletRequest req,ServletResponse resp,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		PrintWriter out=response.getWriter();
		out.print("<b>filter is invoked before</b><br/><br/><br/>");//exe. with request
		response.setContentType("text/html");  			
		HttpSession session = request.getSession(false);

		if (session != null){
			chain.doFilter(req, resp);//send request to nextresource
		}
		else{
			response.sendRedirect("signin.html");
		}
		out.print("<br/><br/><br/><b>filter is invoked after</b>");//exe. with response
	}
	public void destroy() {//overridden destroy() method}
	}
}
