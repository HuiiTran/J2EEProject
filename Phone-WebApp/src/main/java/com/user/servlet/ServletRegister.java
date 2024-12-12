package com.user.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRegister
 */
@WebServlet("/Register")
public class ServletRegister extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			String name = req.getParameter("fullName");
			String email = req.getParameter("email");
			String phonenumber = req.getParameter("phoneNumber");
			String password = req.getParameter("passWord");
			String check = req.getParameter("checkBox");
			
			System.out.println(name + " " + email + " " + phonenumber + " "+ password +" " + check);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
