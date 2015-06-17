package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({"/member.do","/agree.do","/member/searchId.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
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
		String birth = request.getParameter("birthday");
		String birth_radio = request.getParameter("birth_radio");   // boolean 으로 받는 방법?
		String gender_radio = request.getParameter("gender_radio");   // boolean 으로 받는 방법?
		String id = request.getParameter("Id");
		String password = request.getParameter("Password");
		String password_conf = request.getParameter("Password_Conf");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		
		request.setAttribute("name", name);
		request.setAttribute("birth", birth);
		request.setAttribute("birth_radio", birth_radio);
		request.setAttribute("gender_radio", gender_radio);
		request.setAttribute("id", id);
		request.setAttribute("password", password);
		request.setAttribute("password_Conf", password_conf);
		request.setAttribute("email", email);
		request.setAttribute("phone", phone);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/memberGet.jsp");
		dispatcher.forward(request, response);
	}


	   /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

}
