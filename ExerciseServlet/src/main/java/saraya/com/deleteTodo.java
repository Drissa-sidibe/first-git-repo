package saraya.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import saraya.com.model.Todo;
import saraya.com.model.TodoService;

@WebServlet(urlPatterns="/delete.do")
public class deleteTodo extends HttpServlet{
	
	private TodoService todoService=new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
		String tod = request.getParameter("todo");
		String cat=request.getParameter("category");
		todoService.deleteTodo(new Todo(tod,cat));
		
		response.sendRedirect("/todo.do");
	}
}
