package q1;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;n;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/index.do")
public class HelloworldController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		request.getRequestDispatcher("/views/index.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		request.getRequestDispatcher("/views/welcome.jsp").forward(request, response);
	}
}