package com.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticeListController
 */
@WebServlet("/")
public class NoticeListController extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String RequestUrl = request.getRequestURL().toString();
		System.out.println("RequestUrl"+RequestUrl);
		
		String ContextPath = request.getContextPath();
		System.out.println("contextPaht"+ContextPath);//프로젝트 이름
		
		String RequestUri = request.getRequestURI();
		System.out.println("RequestUri"+RequestUri);
		
		String commend = request.getServletPath();
        System.out.println("Commend : "+commend);
        String[] Url = request.getRequestURI().split("/");
        String urlName = Url[Url.length-1];
        System.out.println(urlName);
        
        if(commend.equals("/main.do")) {
        	 RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/board/list.jsp");
             dispatcher.forward(request, response);
        }
	}

}
