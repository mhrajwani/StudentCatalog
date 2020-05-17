package com.fdmgroup.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.model.Student;
import com.fdmgroup.persistence.StudentDao;

public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchStudentServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String search = request.getParameter("search");
		String field = request.getParameter("field");

		StudentDao dao = null;
		List<Student> student = null;
		RequestDispatcher dispatcher = null;
		String field1 = null;

		switch (field) {
		case "firstname":
			dao = new StudentDao();
			student = dao.readFirstName(search);

			field1 = "First Name";
			request.setAttribute("student", student);
			request.setAttribute("field1", field1);
			request.setAttribute("search", search);
			dispatcher = request.getRequestDispatcher("/WEB-INF/searchConfirmation.jsp");

			dispatcher.forward(request, response);

			break;
		case "lastname":

			dao = new StudentDao();
			student = dao.readLastName(search);

			field1 = "Last Name";
			request.setAttribute("field1", field1);
			request.setAttribute("search", search);
			request.setAttribute("student", student);
			dispatcher = request.getRequestDispatcher("/WEB-INF/searchConfirmation.jsp");

			dispatcher.forward(request, response);

			break;
		case "ssn":
			dao = new StudentDao();
			student = dao.readSSN(search);

			field1 = "SSN";
			request.setAttribute("field1", field1);
			request.setAttribute("search", search);
			request.setAttribute("student", student);
			dispatcher = request.getRequestDispatcher("/WEB-INF/searchConfirmation.jsp");

			dispatcher.forward(request, response);
			break;

		default:
			dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");

			dispatcher.forward(request, response);
		}

	}

}
