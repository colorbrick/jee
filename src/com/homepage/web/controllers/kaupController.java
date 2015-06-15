package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.bean.KaupBean;
import com.homepage.web.serviceimpls.KaupServiceImpl;
import com.homepage.web.services.KaupService;

/**
 * @ Date : someday;
 * @ Author : 허성조;
 * @ Story : 키와 몸무게가 입력되면 카우푸지수와 메시지를 웹브라우저에 랜더링 하는 역할;
 */
@WebServlet("/kaup.do")
public class kaupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		KaupService service = new KaupServiceImpl();
		String heightParam = request.getParameter("height");
		String weightParam = request.getParameter("weight");
		double height = Double.parseDouble(heightParam);
		double weight = Double.parseDouble(weightParam);
		System.out.println(weight);
	//	KaupBean bean = new KaupBean();
		
		int idx = service.getKaupIndex(height, weight);
		String result = service.getResultMsg(idx);
		
		request.setAttribute("height", height);
		request.setAttribute("weight", weight);
		request.setAttribute("idx", idx);
		request.setAttribute("result", result);
		
/*		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/kaup.jsp");
		dispatcher.forward(request, response);*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/kaup.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	   /**
     * @see HttpServlet#HttpServlet()
     */
    public kaupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
}
