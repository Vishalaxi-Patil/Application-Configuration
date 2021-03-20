package com.xworkz.login;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends  HttpServlet {
	private String username;
	private String password;
	public LoginServlet() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked do get");
		String name=req.getParameter("userName");
		System.out.println(name);
		
		String pass=req.getParameter("password");
		System.out.println(pass);		
		resp.setContentType("text/html");		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("This is my first writer from resp");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("<b>");
		writer.println("Login "+name+ " "+pass+" data is success");
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		//super.doGet(req, resp);
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init");
		 String initParameter = config.getInitParameter("Username");
		 this.username=initParameter;
		System.out.println(username);
		 String initpass = config.getInitParameter("password");
		 this.password=initpass;
			System.out.println(password);
			
		
	}

}
