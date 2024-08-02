
package com.admin.servlet;

import com.DB.DBConnect;
import com.dao.SpecalistDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addSpecialist")
public class AddSpecialist  extends HttpServlet{
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String specName = req.getParameter("specName");

		SpecalistDao dao = new SpecalistDao(DBConnect.getConn());
		boolean f = dao.addSpecialist(specName);

		HttpSession session = req.getSession();

		if (f) {
			session.setAttribute("succMsg", "Specialist Added");
			resp.sendRedirect("admin/index.jsp");
		} else {
			session.setAttribute("errorMsg", "something wrong on server");
			resp.sendRedirect("admin/index.jsp");
		}

	}
}
