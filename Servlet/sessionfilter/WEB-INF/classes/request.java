// importing the javax.servlet package
// importing java.io package for PrintWriter
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class request extends HttpServlet {

	

	// init method
	public void init(ServletConfig sc) throws ServletException
	{ 	
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,  IOException 
    { 
	}
	
	public void doPost(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, 
        IOException 
    {   
		response.setContentType("text/html");  			
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		if(name.equals("ldrp") && pwd.equals("itr")){
			HttpSession session=request.getSession();  
			session.setAttribute("uname",name);  
			out.print("Redirecting."); 
			RequestDispatcher rd=request.getRequestDispatcher("home");  
			rd.forward(request, response);  
		}
		else{
			
			out.print("User doest not exist."); 

			RequestDispatcher rd=request.getRequestDispatcher("/signin.html");  
			rd.include(request, response);  
		}
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
