<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>



	

		<h1>Welcome ${testName} to the list of your skills </h1>
		<table class="table table-striped">
				<thead>
					<th>Name</th>
					<th>Category</th>
					<th>Delete</th>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.name}</td>
							<td>${todo.category}</td>
							<td><a class="btn btn-danger" href="/delete.do?todo=${todo.name}
							&category=${todo.category}">Delete</a></td>
						</tr>
						
					</c:forEach>
				</tbody>
		</table>
				
							
				
		
	<a class="btn btn-primary" href="/add-todo.do">Add Todo</a>
		
<%@ include file="./common/footer.jspf"%>
