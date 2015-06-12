package com.homepage.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceimpls.HelloServiceImpl;
import com.homepage.web.services.HelloService;

/**
 * Servlet implementation class NowServlet
 */
@WebServlet({"/name/hello.nhn","/hi.do"})
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	request.setCharacterEncoding("UTF-8");
	//	response.setContentType("text/html; charset=UTF-8");

	//	String path = request.getServletPath();
	//	System.out.println("path:"+path);
	/*	
		if(path.equalsIgnoreCase("/name/hello.nhn")){     // equlsIgnoreCase 대소문자 구분 안하게다
			gohello(request, response);
		} else if(path.equalsIgnoreCase("/hi.do")){
			gohi(request, response);
		}
	*/
		switch (request.getServletPath()) {
		case "/name/hello.nhn": goHello(request, response);break;
		case "/hi.do": goHi(request, response);break;
		default:
			System.out.println("페이지 없음"); 	break;
		}
		
		
		
		
		
		/*
		 * PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>인사</title></head>");
		out.println("<body>");
		out.println("안녕하세요,");
		out.println(request.getParameter("name"));
		out.println("님");
		out.println("</body></html>");
		*/
	}



	private void goHi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String namename = request.getParameter("name12");
		request.setAttribute("name34", namename);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/hi.jsp");
		dispatcher.forward(request, response);
	}



	private void goHello(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HelloService hs = new HelloServiceImpl();
		String msg = hs.greet();
		String namename = request.getParameter("name12");
		request.setAttribute("name34", msg + namename);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/hello.jsp");
		dispatcher.forward(request, response);
	}

	
	
}
