package com.xworkz.busBooking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BusBookingWeb extends HttpServlet{
	public BusBookingWeb() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet");
		
		
		String src=req.getParameter("source");
		System.out.println(src);
		String des=req.getParameter("destination");
		System.out.println(des);
		String people=req.getParameter("no_Of_People");
		System.out.println(people);
		String gender=req.getParameter("gender");
		System.out.println(gender);
		String booked=req.getParameter("bookedBy");
		System.out.println(booked);
		String type=req.getParameter("bus_type");	
		System.out.println(type);
		String em=req.getParameter("email");
		System.out.println(em);
		String no=req.getParameter("phone_no");	
		System.out.println(no);
		String vendor=req.getParameter("vendor");	
		System.out.println(vendor);
		String date=req.getParameter("date");
		System.out.println(date);
		resp.setContentType("text/html");
		
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Booked Sucessfully");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("source:"+src);
		writer.println("</br>");
		writer.println("Destination:"+des);
		writer.println("</br>");
		writer.println("No of people:"+people);
		writer.println("</br>");
		writer.println("Gender:"+gender);
		writer.println("</br>");
		writer.println("Booked by:"+booked);
		writer.println("</br>");
		writer.println("Bus type:"+type);
		writer.println("</br>");
		writer.println("Email:"+em);
		writer.println("</br>");
		writer.println("Phone number:"+no);
		writer.println("</br>");
		writer.println("Vendor:"+vendor);
		writer.println("</br>");
		writer.println("Date:"+date);
		writer.println("</br>");
		writer.println("<b>");
		writer.println("Bus booked from "+src+ " to "+des+" ");
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		//super.doGet(req, resp);
		
		
		
	}

}
