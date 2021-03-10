<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>


<div class="container">
			
		<form action="/add-todo.do" method="post">
		  <fieldset class="form-group">
			<label for="skill">Enter a new Skills: </label>
			<input type="text" id="skill" name="leila">
		</fieldset>	
		<fieldset class="form-group">
			<label for="cat">Enter a new Category: </label>
			<input type="text" id="cat" name="categ">
		</fieldset>	
			<input class="btn btn-success" type="submit" value="Create a new skill">
		</form>
</div>
	

		
		
<%@ include file="./common/footer.jspf"%>
