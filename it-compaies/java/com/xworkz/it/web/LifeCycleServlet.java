package com.xworkz.it.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet extends GenericServlet{
	
	
	public LifeCycleServlet() {
		System.out.println("invoked LifeCycleServlet");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("invoked service");
		arg1.setContentType("text/html");
		PrintWriter writer=arg1.getWriter();
			writer.println("<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>This is my new page</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"<h1>second page</h1>\r\n" + 
					"<form action=\"lifeCycleServlet\"  method=\"post\">\r\n" + 
					"<input type=\"submit\" value=\"Service\">\r\n" + 
					"</form>\r\n" + 
					"</body>\r\n" + 
					"</html>");
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
