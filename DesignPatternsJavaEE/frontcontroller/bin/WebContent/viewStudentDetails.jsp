<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student details </title>
</head>
<body>
<jsp:useBean id="studentDetails" type="br.com.bbnsdevelop.views.StudentVO" scope="request"></jsp:useBean>

	Student Id: <jsp:getProperty property="id" name="studentDetails"/>
	Student name: <jsp:getProperty property="name" name="studentDetails"/>

</body>
</html>