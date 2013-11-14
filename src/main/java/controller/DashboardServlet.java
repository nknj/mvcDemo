package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.User;
import model.UserManager;

public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		User u = UserManager.getUser();
		if (u == null) {
			req.getRequestDispatcher("/WEB-INF/404.html").forward(req, resp);
			return;
		}

		req.setAttribute("user", u);
		req.getRequestDispatcher("/WEB-INF/dashboard.jsp").forward(req, resp);
	}

}