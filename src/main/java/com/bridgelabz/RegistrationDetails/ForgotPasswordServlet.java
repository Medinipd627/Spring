package com.bridgelabz.RegistrationDetails;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/******************************************************************************************
*  Created by  medini
 * 
 * 04-Jun-2018
 *
 ******************************************************************************************/
public class ForgotPasswordServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		RequestDispatcher rd= request.getRequestDispatcher("forgot.jsp");
		rd.forward(request, response);	
	}
}