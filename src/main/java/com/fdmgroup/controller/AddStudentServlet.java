package com.fdmgroup.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.model.Student;
import com.fdmgroup.persistence.StudentDao;

public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String ssn = request.getParameter("ssn");

		StudentDao studentDao = new StudentDao();
		Student student = new Student(firstname, lastname, ssn);
		boolean added = studentDao.create(student);

		if (added) {
			request.setAttribute("student", student);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/addConfirmation.jsp");

			dispatcher.forward(request, response);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
		dispatcher.forward(request, response);
	}

}
