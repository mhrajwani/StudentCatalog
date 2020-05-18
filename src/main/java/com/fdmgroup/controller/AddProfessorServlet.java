package com.fdmgroup.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.model.Professor;
import com.fdmgroup.persistence.ProfessorDao;

public class AddProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddProfessorServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("aname");
		String password = request.getParameter("password");

		ProfessorDao dao = new ProfessorDao();
		Professor prof = new Professor(name, password);
		dao.create(prof);

		request.setAttribute("dao", dao);
		request.setAttribute("prof", prof);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/addProfessorConfirmation.jsp");

		dispatcher.forward(request, response);
	}

}
