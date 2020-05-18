package com.fdmgroup.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.model.Professor;
import com.fdmgroup.persistence.ProfessorDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String professorName = request.getParameter("pn");
		String password = request.getParameter("password");

		ProfessorDao dao = new ProfessorDao();
		Professor professor = dao.read(professorName);

		if (professor == null) {
			HttpSession session = request.getSession();
			String message = "Incorrect Login Credentials";
			session.setAttribute("message", message);
			response.sendRedirect("login");
		} else if (professorName.equals(professor.getProfessorName())
				&& password.equals(professor.getProfessorPassword())) {
			HttpSession session = request.getSession();
			session.setAttribute("prof", professor);
			response.sendRedirect("index2");
		} else {
			HttpSession session = request.getSession();
			String message = "Incorrect Login Credential";
			session.setAttribute("message", message);
			response.sendRedirect("login");

		}
	}

}
