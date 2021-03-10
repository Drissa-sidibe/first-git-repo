package saraya.com.model;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo>todos = new ArrayList<>();
	
	static {
		todos.add(new Todo("HTML","Learn"));
		todos.add(new Todo("CSS","Learn"));
		todos.add(new Todo("BasketBall","Sport"));
		todos.add(new Todo("Quran","Religious"));
		todos.add(new Todo("Terminal","Informatics"));
	}
	public List<Todo> retrieveTodos(){
		return todos;
	}
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
