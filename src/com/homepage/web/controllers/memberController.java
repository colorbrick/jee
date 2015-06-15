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
	
	Map<String,Object> map = new HashMap<String,Object>();
	MemberBean bean = new MemberBean();
	MemberService service = new MemberServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String path = request.getServletPath();
		switch (path) {
		case "/model2/join.do" :
			String id = request.getParameter("id");
			String password = request.getParameter("password"); 
			String name = request.getParameter("name"); 
			String ageParam = request.getParameter("age");
			int age = Integer.parseInt(ageParam);
			String addr = request.getParameter("address");
			bean.setAddr(addr);
			bean.setAge(age);
			bean.setId(id);
			bean.setName(name);
			bean.setPassword(password);
			
			service.join(id, password, name, age, addr);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/memberForm.jsp");
			dispatcher.forward(request, response);
			break;
			
	/*		request.setAttribute("id", id);
			request.setAttribute("password", password);
			request.setAttribute("name", name);
			request.setAttribute("age", age);
			request.setAttribute("address", addr);*/
			
		case "/model2/login.do" :
			String id2 = bean.getId();
			String password2 = bean.getId();
			String name2 = bean.getName();
			int age2 = bean.getAge();
			String addr2 = bean.getAddr();
			

			//service.login(id2, password2);
			
		
			
			String idx = service.login(id2, password2);
			request.setAttribute("idx", idx);
			String msg = "";
			System.out.println(idx);
			if(idx==1){
				
			}else if(idx==2){
				msg ="입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요";
			}else{
				msg ="비번이 다릅니다.다시 입력하세요.";
			}
			
			System.out.println(path);
			switch (idx) {
			case 1:
				request.setAttribute("id", bean.getId());
				request.setAttribute("password", password2);
				request.setAttribute("name", name2);
				request.setAttribute("age", age2);
				request.setAttribute("address", addr2);
				RequestDispatcher dispatcher2 = request.getRequestDispatcher("/views/model2/member.jsp");
				dispatcher2.forward(request, response);
				break;

			case 2:
				request.setAttribute("msg", msg);
				 dispatcher2 = request.getRequestDispatcher("/views/model2/loginFail.jsp");
				dispatcher2.forward(request, response);
				break;
			default:
				request.setAttribute("msg", msg);
				 dispatcher2 = request.getRequestDispatcher("/views/model2/loginFail.jsp");
				dispatcher2.forward(request, response);
				break;
			}
			break;
		}
	}
}
