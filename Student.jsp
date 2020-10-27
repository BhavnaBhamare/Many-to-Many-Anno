<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
tr {
	border: thick;
	border-color: yellow;
	height: 3cm;
}
</style>
</head>
<body>
	<form action="StudentServlet" method="post">
		<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<th colspan="2">Student Details</th>
			</tr>
			<tr align="center">
				<td>First Name:-</td>
				<td><input type="text" name="sfname"></td>
			</tr>
			<tr align="center">
				<td>Last Name:-</td>
				<td><input type="text" name="slname"></td>
			</tr>
			<tr align="center">
				<td>Father Name:-</td>
				<td><input type="text" name="sfaname"></td>
			</tr>
			<tr align="center">
				<td>Mother Name:-</td>
				<td><input type="text" name="smname"></td>
			</tr>
			<tr align="center">
				<td>Email:-</td>
				<td><input type="text" name="semail"></td>
			</tr>
			<tr align="center">
				<td>Gender:-</td>
				<td><select name="sgender">
				<option>Female</option>
				<option>Male</option>
				<option>Other</option>				
				</select></td>
			</tr>
			<tr align="center">
				<td>Phone:-</td>
				<td><input type="text" name="sphone"></td>
			</tr>
			<tr align="center">
				<td>Address:-</td>
				<td><input type="text" name="saddress"></td>
			</tr>
			<tr align="center">
				<td>Date of Birth:-</td>
				<td><input type="text" name="sdateofbirth"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Student"></td>
			</tr>
		</table>
	</form>
</body>
</html>