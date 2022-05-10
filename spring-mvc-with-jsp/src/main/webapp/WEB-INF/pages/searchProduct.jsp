<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${title}
<form:form method="post" >
<lable>ProductId</lable>
<input type="number" name="id">
<input type="submit" value="Add">
</form:form>
</body>
</html>