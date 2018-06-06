package com.ZGY.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ZGY.Servlet.Dao.IUserDAO;
import com.ZGY.Servlet.Dao.Impl.UserDAOImpl;
import com.ZGY.Servlet.Util.servletUtil;
import com.ZGY.Servlet.pojo.User;
@WebServlet("*.do")
public class HelloServlet extends HttpServlet {
	//@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		PrintWriter out=response.getWriter();
////		out.print("<h1>Hello Servlet!!!!</h1>");
//	}
	servletUtil s=new servletUtil();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String uri=request.getRequestURI();
//		System.out.println(uri);
		String url=request.getRequestURL().toString();
//		System.out.println(url);
		String path=url.substring(url.lastIndexOf("/"),url.lastIndexOf("."));
		System.out.println(path);
		
		s.setEncoding(request, response);
		PrintWriter out=response.getWriter();
		IUserDAO db =new UserDAOImpl();
		
		if("/user_list".equals(path)) {
			List<User>users=db.findAll();
			//通过转发将数据交给jsp页面处理
			//绑定数据
			request.setAttribute("users", users);
			request.getRequestDispatcher("user_list.jsp").forward(request, response);
		}else if("/user_register".equals(path)) {
			//用户注册逻辑
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String phone=request.getParameter("phone");
			String addr=request.getParameter("addr");
			User user =new User(username,password,phone,addr);
//			System.out.println(username);
			db.add(user);
		}else if("/user_delete".equals(path)) {
			int id=Integer.parseInt(request.getParameter("id"));
			//删除逻辑
			db.delete(id);
			//
			response.sendRedirect("user_list.do");
		}else if("/user_rivese".equals(path)) {
			//用户修改逻辑
			//通过转发将数据交给jsp页面处理
			//绑定数据
			
			int id=Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			User user=new User();
			//得到修改后的用户信息
			if(request.getParameter("username") == null) {
				user=db.findById(id);
				request.setAttribute("user", user);
				request.getRequestDispatcher("user_rivese.jsp").forward(request, response);
				
			}else {
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				String phone=request.getParameter("phone");
				String addr=request.getParameter("addr");
				user =new User(username,password,phone,addr);
				user.setId(id);
				db.update(user);
				response.sendRedirect("user_list.do");
				
			}
			
			
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doGet(request, response);
	}

}
