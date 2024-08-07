// importing the javax.servlet package
// importing java.io package for PrintWriter
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class home extends HttpServlet {

	

	// init method
	public void init(ServletConfig sc) throws ServletException
	{ 	
	}
	
	
	public void doPost(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, 
        IOException 
    {            
		response.setContentType("text/html");  			
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.print("<b>Here we have printed name using request </b><br/><br/><br/>");  
		out.print("Welcome "+name + "<br/><br/><br/>");  
		
		out.print("<a>Home</a> <br/><br/><br/>");  
		out.print("<a href='profile'>Profile</a> <br/><br/><br/>");  
		out.print("<a href='logout'>Logout</a> <br/><br/><br/>");  
       
    }

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,  IOException 
    {   
		
       
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
