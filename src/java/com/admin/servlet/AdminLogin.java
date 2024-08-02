
package com.admin.servlet;

import com.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet{
    
     
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
		try {

			String email = req.getParameter("email");
			String password = req.getParameter("password");

			HttpSession session = req.getSession();

			if ("nandkishorasambe98@gmail.com".equals(email) && "admin".equals(password)) {
	                 session.setAttribute("errorMsg", "invalid email & password");
				resp.sendRedirect("adminDash.jsp");
                            
			} else {
				
			out.println("<html><body><h1>invalid email & password</h1></body></html>");
                        }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}