<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="addDepartment">
			<table border="1">
				<tr>
					<th>Department name:</th>
					<td><input type="text" name="department_name" placeholder="Enter Department name here..." /></td>
				</tr>
				<tr>
					<th>Location:</th>
					<td><input type="text" name="location_id" placeholder="Enter location id here..." /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"	value="Create" /></td>
				</tr>
			</table>
		</form>

		<br />
		<c:if test="${!empty DepartmentList}">
			<table border="3px">
				<thead>
					<tr>
						<th>No.</th>
						<th>Dept name</th>
						<th>Location ID</th>
						<th>Action</th>
					</tr>
				</thead>
					<tbody>
					<c:forEach var="d" items="${DepartmentList}" varStatus="c">
					<form action="updateDepartment" method="POST">
						<tr>
							<td>${c.count}</td>
							<td>
								<input type="text" value="${d.department_name}" name="department_name" />
								<input type="hidden" value="${d.department_id}" name="department_id"/></td>
							<td><input type="text" value="${d.location_id}" name="location_id"/></td>
							<td><button type="submit">Update</button></td>
							<td><a href="deleteDepartment?department_id=${d.department_id}">Delete</a></td>
						</tr>	
					</form>
						</c:forEach>
					</tbody>
			</table>
		</c:if>
	</div>

</body>
</html>