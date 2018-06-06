package com.ZGY.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ZGY.Servlet.Dao.IUserDAO;
import com.ZGY.Servlet.Dao.Impl.UserDAOImpl;
import com.ZGY.Servlet.Util.servletUtil;
import com.ZGY.Servlet.pojo.User;

public class HelloServlet extends HttpServlet {
	//@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		PrintWriter out=response.getWriter();
////		out.print("<h1>Hello Servlet!!!!</h1>");
//	}
	servletUtil s=new servletUtil();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		s.setEncoding(request, response);
		PrintWriter out=response.getWriter();
		IUserDAO db =new UserDAOImpl();
		List<User>users=new ArrayList<>();
		users=db.findAll();
		for (User tempUser : users) {
			out.println(tempUser+"<br>");
		}

		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
