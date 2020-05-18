package com.fdmgroup.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.persistence.StudentDao;

public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteStudentServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		StudentDao dao = new StudentDao();

		HttpSession session = request.getSession(false);
		if (session.getAttribute("prof") == null) {
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WEB-INF/login.jsp");

			dispatcher1.forward(request, response);

		} else {
			boolean success = dao.delete(id);

			request.setAttribute("success", success);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/deleteConfirmation.jsp");

			dispatcher.forward(request, response);
		}

	}

}
