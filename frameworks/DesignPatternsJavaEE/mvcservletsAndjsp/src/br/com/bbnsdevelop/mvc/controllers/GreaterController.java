package br.com.bbnsdevelop.mvc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bbnsdevelop.mvc.model.GreaterModel;

@WebServlet("/greaterController")
public class GreaterController extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = convertStringToNumber(request.getParameter("number1"));
		int num2 = convertStringToNumber(request.getParameter("number2"));
		
		GreaterModel model = new GreaterModel();
		int result = model.calculateGreater(num1, num2);
		
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("greater-result.jsp");
		dispatcher.forward(request, response);
		
	}
	
	
	private int convertStringToNumber(String parameter) {
		return Integer.parseInt(parameter);
	}

}
