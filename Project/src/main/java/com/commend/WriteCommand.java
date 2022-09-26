package com.commend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface WriteCommand extends Commend{

	@Override
	default void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	String name =	request.getParameter("name");
	
	String pass =	request.getParameter("pass");
	String title =	request.getParameter("title");
	String content =	request.getParameter("content");
		
		
	}
 
	
}
