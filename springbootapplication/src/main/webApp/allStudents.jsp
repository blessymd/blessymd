<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="view" method="get">
<c:if test="${not empty studentList}">
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Address</th>
</tr>
<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.getId()}</td>
<tr>${student.getName()}</tr>
<tr>${student.getAddress()}</tr>
</c:forEach>
</table>
</c:if>
</form>
</body>
</html>