/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.servlet;

import com.DB.DBConnect;
import com.dao.userDao;
import com.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
		
        String email = req.getParameter("email");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();

		userDao dao = new userDao(DBConnect.getConn());
		User user = dao.login(email, password);

		if (user != null) {
                      session.setAttribute("userObj", user);
			//resp.sendRedirect("adminDash.jsp");
                       // out.println("<html><body><h1>valid email & password</h1></body></html>");
                      
                        
		} else {
			session.setAttribute("errorMsg", "invalid email & password");
			//resp.sendRedirect("User_login.jsp");
                         //out.println("<html><body><h1>invalid email </h1></body></html>");
                      
                       
		}

	}

}