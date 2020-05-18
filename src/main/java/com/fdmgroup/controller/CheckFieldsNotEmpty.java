package com.fdmgroup.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckFieldsNotEmpty implements Filter {

	public CheckFieldsNotEmpty() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String ssn = request.getParameter("ssn");

		if (fname == null || fname.trim().isEmpty()) {
			String msg = "First Name is Null or Empty";
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("add");
			dispatcher.forward(request, response);
		} else if (lname == null || lname.trim().isEmpty()) {
			String msg = "Last Name is Null or Empty";
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("add");
			dispatcher.forward(request, response);
		} else if (ssn == null || ssn.trim().isEmpty()) {
			String msg = "SSN is Null or Empty";
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("add");
			dispatcher.forward(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
