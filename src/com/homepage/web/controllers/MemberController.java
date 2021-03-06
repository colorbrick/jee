package com.homepage.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@WebServlet({"/model2/join.do","/model2/login.do",
			"/member/searchIdForm.do","/member/searchPassForm.do",
			"/member/searchAllMembers.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, Object> map = new HashMap<String, Object>();
	MemberService service = MemberServiceImpl.getInstance();
    MemberBean bean = new MemberBean();
	
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		switch (request.getServletPath()) {
		case "/member/searchIdForm.do" : 
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/searchIdForm.jsp");
			dispatcher.forward(request, response);
			break;
		case "/member/searchPassForm.do" : 
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("/views/model2/searchPassForm.jsp");
			dispatcher2.forward(request, response);
			break;
		case "/member/searchAllMembers.do" :
			List<MemberBean> list = new ArrayList<MemberBean>();
			list = service.getList();
			
			request.setAttribute("memberList", list);
			RequestDispatcher dispatcher3 = request.getRequestDispatcher("/views/model2/memberList.jsp");
			dispatcher3.forward(request, response);
			break;
		default: break;
		}
    }
    
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
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		
		bean.setName(name);
		bean.setId(id);
		bean.setPassword(password);
		bean.setEmail(email);
		bean.setAddr(address);
		
		int result = service.join(bean);
		String joinMsg = "";
		if (result !=0) {
			joinMsg = name + "님 환영합니다.";
		} else {
			joinMsg = "회원가입에 실패했습니다.";
		}
		request.setAttribute("msg", joinMsg);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/main.jsp"); 
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
