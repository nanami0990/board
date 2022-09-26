package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.commend.Commend;
import com.commend.ContentCommand;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doaction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doaction(request, response);
	}
	protected void doaction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = "/WEB-INF/board/";
		Commend command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		System.out.println(uri+"uri");
		System.out.println(conPath+"conPath");
		System.out.println(com+"com");
		
		
		if(com.equals("/write_view.do")) {
			viewPage += "write_view.jsp";
		}
		
//		 else if(com.equals("/write.do")) { 
//			 command = new WriteCommand();
//		  command.execute(request,response); 
//		  viewPage = "list.do"; 
//		  } 
//		 else if(com.equals("/list.do")) {
//			  command = new ListCommand();
//		  command.execute(request,response); 
//		  viewPage = "list.jsp"; 
//		  } else if(com.equals("/content_view.do")) { 
//			  command = new ContentCommand();
//		  command.execute(request,response);
//		  viewPage = "content_view.jsp";
//		  } else if(com.equals("/modfiy.do")) { 
//			command = new ModfiyCommand();
//		  command.execute(request,response); 
//		  viewPage = "list.do"; 
//		  } else if(com.equals("/delect.do")) { 
//			  command = new delectCommand();
//		  command.execute(request,response); 
//		  viewPage = "list.do"; 
//		  } else if(com.equals("/reply_view.do")) { 
//		  command = new ReplyViewommand();
//		  command.execute(request,response); 
//		  viewPage = "reply_view.jsp"; 
//		  } else if(com.equals("/reply.do")) {
//		  command = new ReplyCommand();
//		  command.execute(request,response); 
//		  viewPage = "list.do"; }
//		 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
