package com.utrupLogin;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

@WebServlet(urlPatterns = "/login.do") 
public class LoginServlet extends HttpServlet {
	
	//UserValidationService Constructor
	private UserValidationService service = new UserValidationService();
	
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}//doGet	
	
	
	//doPost Method
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Request Name Param in Login.jsp
		String name = request.getParameter("name");
		
		//Request Password Param in Login.jsp
		String password = request.getParameter("password");
		
		boolean isUserValid = service.isUserValid(name, password);
		
		if(isUserValid) {
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}//if(isUserValid)
		
		else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		}//else
		
		
}//doPost
}//LoginServlet
