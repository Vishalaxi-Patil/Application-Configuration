package com.xworkz.simplePage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dao.ContactDaoImpl;
import com.xworkz.dao.ContactFormDao;
import com.xworkz.entity.ContactForm;
import com.xworkz.services.ContactService;
import com.xworkz.services.ContactServiceImpl;

public class SimpleForm extends HttpServlet{
	private ContactService service;
	public SimpleForm() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init method");
		service=new ContactServiceImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("invoked doPost");
	
	String name=req.getParameter("name");
	System.out.println(name);
	String phone=req.getParameter("no");
	System.out.println(phone);
	
	String email=req.getParameter("email");
	System.out.println(email);
	String yourself=req.getParameter("yourself");
	System.out.println(yourself);
	
	resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1>");
	writer.println("Contacted by:"+name);
	writer.println("</h1>");	
	writer.println("<h2>");	
	//forms.setId(4);
	writer.println("<a href='index.html'>Add more contact</a>");	
	writer.println("</h2>");	
	writer.println("</body>");
	writer.println("</html>");	
	//ContactService service=new ContactServiceImpl();
	ContactForm forms=new ContactForm(name, phone, email, yourself);
	boolean success=this.service.validateAndSave(forms);
	System.out.println("success");
	System.out.println("contact detailes saved for user "+name);
	System.out.println("contact detailes saved for phone "+phone);
	
	
	}
	

}
