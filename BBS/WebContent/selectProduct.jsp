<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String user = request.getParameter("user");
	if(user != null){
		session.setAttribute("user", user);
	}
	if(user == null){
		session.setAttribute("user", session.getAttribute("user"));
	}
%>
<form action="addProduct.jsp">
<select name="product">
	<option>apple</option>
	<option>orange</option>
	<option>lemon</option>
</select>
<input  type="submit" value="장바구니로">
</form>
</body>
</html>