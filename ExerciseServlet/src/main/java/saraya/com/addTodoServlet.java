package saraya.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import saraya.com.model.Todo;
import saraya.com.model.TodoService;

@WebServlet(urlPatterns="/add-todo.do")
public class addTodoServlet extends HttpServlet{
	
	TodoService service = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{	
request.getRequestDispatcher("/WEB-INF/views/addTodo.jsp").forward(request, response);
		
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		String idriss = request.getParameter("leila");
		String cheikhou = request.getParameter("categ");
					service.addTodo(new Todo(idriss,cheikhou));
					response.sendRedirect("/todo.do");
	}
}
