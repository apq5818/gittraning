
import javax.servlet.*;  
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */


@WebServlet("/welcome")
public class Hello extends HttpServlet {


	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
 {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
  
		String name=req.getParameter("name");//will return value  
		pw.println("Welcome "+name);  
  
		//pw.close();
	}

}



