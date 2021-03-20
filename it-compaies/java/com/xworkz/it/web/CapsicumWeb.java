package com.xworkz.it.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CapsicumWeb   extends HttpServlet {
	public CapsicumWeb() {
	System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked do get");
		String quantityFrmGet=req.getParameter("color");
		System.out.println(quantityFrmGet);
		
		String priceFrmGet=req.getParameter("price");
		System.out.println(priceFrmGet);
		
		
		
		
		resp.setContentType("text/html");
		
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("This is my first writer from resp");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("<b>");
		writer.println("Capsicum "+quantityFrmGet+ " "+priceFrmGet+" data is success");
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		//super.doGet(req, resp);
	}


}
