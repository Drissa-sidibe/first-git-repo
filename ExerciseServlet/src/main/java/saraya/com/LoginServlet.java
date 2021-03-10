package saraya.com;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	LoginService service = new LoginService();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isValidUser = service.validateUser(name, password);
		if(isValidUser) {
			request.getSession().setAttribute("testName", name);
			request.setAttribute("myPassword", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "Sorry Wrong Credential!!! Please try again");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}
