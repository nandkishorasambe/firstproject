
package com.user.servlet;

import com.DB.DBConnect;
import com.dao.userDao;
import com.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/user_register")
public class UserRegister extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
      resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        
        try{
            String fullName=req.getParameter("fullName");
            String email=req.getParameter("email");
            String password=req.getParameter("password");
            
            User u=new User(fullName,email,password);
            userDao dao= new userDao(DBConnect.getConn());
            
            boolean f=dao.userRegister(u);
          if (f) {

			  out.println("<html><body><h1>Registration  successful</h1></body></html>");

			} else {
					  out.println("<html><body><h1>Somthing is wrong</h1></body></html>");		}
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
