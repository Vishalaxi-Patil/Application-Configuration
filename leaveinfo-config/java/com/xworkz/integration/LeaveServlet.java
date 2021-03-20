package com.xworkz.integration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dao.LeaveDAO;
import com.xworkz.dao.LeaveDAOImpl;
import com.xworkz.entity.LeaveEntity;
import com.xworkz.services.LeaveService;
import com.xworkz.services.LeaveServiceImpl;

public class LeaveServlet extends HttpServlet {
	
	private LeaveService<LeaveEntity> service;

	public LeaveServlet() {
		System.out.println("Invoked :" + this.getClass().getSimpleName());
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("created init object only one time");
		service=new LeaveServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doPost");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String no = req.getParameter("no");
		String reason = req.getParameter("reason");
		String date = req.getParameter("date");
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);
		System.out.println(reason);
		System.out.println(date);
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println(" " + name + " sucessfully taken " + no + " days leave");
		writer.println("</h1>");
		writer.println("<a href='leaveinfo.html'>add one more leave info</a>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();

		LeaveEntity entity = new LeaveEntity(name, email, no, reason, date);
		boolean saved = this.service.validateAndSave(entity);
		if (saved) {
			System.out.println("saved successfully");
		} else {
			System.out.println("failed to save");
		}

	}

}
