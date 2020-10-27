<%@page import="java.util.List"%>
<%@page import="com.pojo.Student"%>
<%@page import="com.pojo.Teacher"%>
<%@page import="com.model.BLManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
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
<%
BLManager bl=new BLManager();
Teacher t=new Teacher();
Student s=new Student();

List<Teacher> tl = bl.serachTeacherlist();
session.setAttribute("list", tl);

List<Student> sl = bl.serachStudentlist();
session.setAttribute("list1", sl);
%>

<form action="DepartServlet" method="post">
<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<td>Name :</td>
				<td><input type="text" name="dname"></td>
			</tr>
			<tr align="center">
				<td>Email :</td>
				<td><input type="text" name="demail"></td>
			</tr>
			<tr align="center">
				<td>Phone:</td>
				<td><input type="text" name="dphone"></td>
			</tr>
			<tr>
				<td>Teacher Name</td>
				<td><select name="tfname">
				<option>Select Teacher</option>
				<c:forEach items="${sessionScope.list}" var="tl">
				<option>${tl.tfname}</option>
				</c:forEach>
				</select>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><select name="sfname">
				<option>Select Student</option>
				<c:forEach items="${sessionScope.list1}" var="sl">
				<option>${sl.sfname}</option>
				</c:forEach>
				</select>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Department"></td>
			</tr>
</table>
</form>
</body>
</html>