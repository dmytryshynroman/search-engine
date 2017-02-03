package org.roman.company.search.engine.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/SearchEngineServlet")
public class SearchEngineServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// System.out.println("Info");
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// PrintWriter out = response.getWriter();
		// out.println("<html>My Servlet</html>");
		// out.close();

		String text = request.getParameter("q");
		String limit = request.getParameter("limit");
		String length = request.getParameter("length");
		String includeMetaData = request.getParameter("includeMetaData");
		// And modify existing code to (this is done to assure that we parsed
		// request parameters on backend successfully):
		PrintWriter out = response.getWriter();
		out.println("<html>" + text + " " + limit + " " + length + " " +
		includeMetaData + "</html>");
		out.close();

	}
}
