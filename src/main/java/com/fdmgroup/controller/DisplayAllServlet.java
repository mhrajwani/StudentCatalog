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

public class DisplayAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayAllServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentDao dao = new StudentDao();
		List<Student> studentList = dao.readAll();

		request.setAttribute("students", studentList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/displayAllStudent.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
