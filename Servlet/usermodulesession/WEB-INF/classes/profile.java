// importing the javax.servlet package
// importing java.io package for PrintWriter
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class profile extends HttpServlet {

	

	// init method
	public void init(ServletConfig sc) throws ServletException
	{ 	
	}
	
	
	public void doPost(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, 
        IOException 
    {            
		
       
    }

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,  IOException 
    {   
		response.setContentType("text/html");  			
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		
		String n=(String)session.getAttribute("uname");  
		
		out.print("Welcome "+n + "<br/><br/><br/>" );  
		out.print("We have printed it using session <br/><br/><br/>" );  
		out.print("<a href='home'>Home</a> <br/><br/><br/>");  
		out.print("<a >Profile</a> <br/><br/><br/>");  
		out.print("<a href='logout'>Logout</a> <br/><br/><br/>");  
		
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
