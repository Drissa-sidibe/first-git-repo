package saraya.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import saraya.com.model.TodoService;

@WebServlet(urlPatterns="/todo.do")
public class TodoServlet extends HttpServlet{
	
	TodoService todoService = new TodoService();
	
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws IOException, ServletException{
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,
				response);
	}
}
