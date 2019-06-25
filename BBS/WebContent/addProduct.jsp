<%@page import="java.util.ArrayList"%>
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
String product = request.getParameter("product");
ArrayList<String> basket = (ArrayList<String>)session.getAttribute("basket");
if(basket == null){
	basket = new ArrayList<String>();
}
basket.add(product);
session.setAttribute("basket", basket);
%>
<%= session.getAttribute("user") %>님의 장바구니에 <%= product %>이 추가되었습니다.<br><br>
<a href="checkOut.jsp">결제하시겠습니까?</a><br>
<a href="selectProduct.jsp">물건을 계속 보시겠습니까?</a>

</body>
</html>