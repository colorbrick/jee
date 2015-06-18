package member;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet({"/member.do","/login.do","/member/searchId.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, Object> map = new HashMap<String, Object>();
	MemberService service = new MemberServiceImpl();
	MembersBean bean = new MembersBean();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
		
		switch (request.getServletPath()) {
		case "/member/searchId.do" : 
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/searchIdForm.jsp");
			dispatcher.forward(request, response);
			break;
		/*case "/member/searchPass.do" : 
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("/views/member/searchPassForm.jsp");
			dispatcher2.forward(request, response);
			break;*/
		default: break;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		switch (request.getServletPath()) {
		case "/member.do" : goMember(request, response);break;
		case "/login.do" : goLogin(request, response);break;
//		case "/agree.do" : goAgree(request, response);break;
		default:
			System.out.println("페이지 없음"); 	break;
		}
	}
/*
	private void goAgree(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String policy = request.getParameter("policy");
		request.setAttribute("policy", policy);
		
		System.out.println(request.getAttribute("policy"));
		
		if(request.getAttribute("policy") == "true"){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/memberJoin.jsp");
			dispatcher.forward(request, response);
			
		} else if(request.getAttribute("policy") == "false") {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/memberHeader.jsp");
			dispatcher.forward(request, response);
		}
	}  
	*/

	private void goMember(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String birthdayRadio = request.getParameter("birthdayRadio");   // boolean ?
		String gender = request.getParameter("gender");   // boolean ?
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userPwConf = request.getParameter("userPwConf");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String adminId = request.getParameter("adminId");
		String adminPw = request.getParameter("adminPw");
	
		bean.setName(name);
		bean.setBirthday(birthday);
		bean.setBirthdayRadio(birthdayRadio);
		bean.setGender(gender);
		bean.setUserId(userId);
		bean.setUserPw(userPw);
		bean.setUserPwConf(userPwConf);
		bean.setEmail(email);
		bean.setPhone(phone);
		bean.setAdminId(adminId);
		bean.setAdminPw(adminPw);
		
		service.join(name, birthday, birthdayRadio, gender, userId, userPw, userPwConf, email, phone, adminId, adminPw);
		
		request.setAttribute("name", name);
		request.setAttribute("birthday", birthday);
		request.setAttribute("birthdayRadio", birthdayRadio);
		request.setAttribute("gender", gender);
		request.setAttribute("userId", userId);
		request.setAttribute("userPw", userPw);
		request.setAttribute("userPwConf", userPwConf);
		request.setAttribute("email", email);
		request.setAttribute("phone", phone);
		request.setAttribute("adminId", adminId);
		request.setAttribute("adminPw", adminPw);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/memberHeader.jsp");
		dispatcher.forward(request, response);
	}
	
	private void goLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String msg = service.login(userId, userPw);

		if(msg.equals("환영합니다.")){
			request.setAttribute("name", bean.getName());
			request.setAttribute("birthday", bean.getBirthday());
			request.setAttribute("birthdayRadio", bean.getBirthdayRadio());
			request.setAttribute("gender", bean.getGender());
			request.setAttribute("userId", bean.getUserId());
			request.setAttribute("userPw", bean.getUserPw());
			request.setAttribute("userPwConf", bean.getUserPwConf());
			request.setAttribute("email", bean.getEmail());
			request.setAttribute("phone", bean.getPhone());
			request.setAttribute("adminId", bean.getAdminId());
			request.setAttribute("adminPw", bean.getAdminPw());
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/memberHeader.jsp");
			dispatcher.forward(request, response);
			
		}else{
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/loginFail.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}