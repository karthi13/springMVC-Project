<%@ include file="common/header.jspf"%>
<%@ page isELIgnored="false" %>
<form action="/display" method="post">
	<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Transaction ID</th>
				<th>Date</th>
				<th>Account Name</th>
				<th>Account Number</th>
				<th>Amount In</th>
				<th>Amount Out</th>
				<th>Balance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${statement}" var="todo">
				<tr>
					<td>${todo.Id}</td>
					<td><fmt:formatDate pattern="MM/dd/yyyy" value="${todo.Date}" /></td>
					<td><c:out value="${todo.AccountHolderName}" /></td>
					<td><c:out value="${todo.AccountNumber}" /></td>
					<td><c:out value="${todo.Amt_in}" /></td>
					<td><c:out value="${todo.Amt_out}" /></td>
					<td><c:out value="${todo.AmtBalance}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<input type="submit" value="Return To Menu">
	
</div>
	</form>


<%@ include file="common/footer.jspf"%>