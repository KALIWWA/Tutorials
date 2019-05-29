package net.javatutorial.tutorials;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "simpleServlet", urlPatterns = { "/hello" }, loadOnStartup = 1)
public class ServletWithAnnotations extends HttpServlet {

	private static final long serialVersionUID = -3462096228274971485L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().println("Hello World!");
	}

}
