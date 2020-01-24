<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addEmployee">
	<table>
		<caption>Enter Employee Information</caption>
		<tr>
			<td>Id:</td> 
			<td><input type="text" name="id"></td>
		</tr>
		
		<tr>
			<td>Name:</td> 
			<td><input type="text" name="Name"></td>
		</tr>
		
		<tr>
			<td>Points: </td>
			<td><input type="text" name="Points"></td>
		</tr>
		
		<tr>
		<td></td>
		<td>[Note: Id #1 is already used]</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit"><br></td>
		</tr>
		
	</table>

</form>

</body>
</html>
