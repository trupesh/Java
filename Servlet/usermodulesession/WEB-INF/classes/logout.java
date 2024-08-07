// importing the javax.servlet package
// importing java.io package for PrintWriter
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class logout extends HttpServlet {

	

	// init method
	public void init(ServletConfig sc) throws ServletException
	{ 	
	}
	
	
	public void doGet(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, 
        IOException 
    {   
		
		HttpSession session=request.getSession(false);  
		session.invalidate();
		response.sendRedirect("http://localhost:8080/usermodulesession/signin.html");
		

    }

	
	// destroy method
	public void destroy()
	{
		System.out.println("in destroy");
	}
	public String getServletInfo()
	{
		return "TEST";
	}
	public ServletConfig getServletConfig()
	{
		return null; // getServletConfig
	}
}
