package org.roman.company.search.engine.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchEngineServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("Info");
        response.getWriter().append("Served at: ").append(request.getContextPath());
        PrintWriter out = response.getWriter();
        out.println("Hel                       lloooo !!!!");
        out.close();

    }
}
