package com.homepage.web.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.bean.MemberBean;
import com.homepage.web.serviceimpls.KaupServiceImpl;
import com.homepage.web.serviceimpls.MemberServiceImpl;
import com.homepage.web.services.KaupService;
import com.homepage.web.services.MemberService;

/**
 * @ Date : someday;
 * @ Author : 허성조;
 * @ Story : 회원가입과 로그인 담당하는 컨트롤러;
 */
@WebServlet({"/model2/join.do","/model2/login.do"})
public class memberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, Object> map = new HashMap<String, Object>();
	MemberService service = new MemberServiceImpl();
    MemberBean bean = new MemberBean();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		switch (request.getServletPath()) {
		case "/model2/join.do":	goJoin(request, response); break;
		case "/model2/login.do": goLogin(request, response); break;
		default: break;
		}
	}
	
	
	private void goJoin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String ageParam = request.getParameter("age");
		String address = request.getParameter("address");
		int age= Integer.parseInt(ageParam);
		
		bean.setName(name);
		bean.setId(id);
		bean.setPassword(password);
		bean.setAge(age);
		bean.setAddr(address);
		
		service.join(id, password, name, age, address);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/memberForm.jsp"); 
		dispatcher.forward(request, response);
	}
	
	private void goLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String msg = service.login(id, password);
		if(msg.equals("환영합니다.")){
			request.setAttribute("name", bean.getName());
			request.setAttribute("id", bean.getId());
			request.setAttribute("age", bean.getAge());
			request.setAttribute("address", bean.getAddr());
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/member.jsp");
			dispatcher.forward(request, response);
		}else{
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/loginFail.jsp");
			dispatcher.forward(request, response);
		}
		
	}
}
