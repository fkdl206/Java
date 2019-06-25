<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<String> basket = (ArrayList<String>)session.getAttribute("basket");
for(int i = 0; i < basket.size(); i++){
	String product = (String)basket.get(i);
%>
당신이 선택한 물건은 <%= product %><br>
<%}
int count = basket.size();
%>
<%= session.getAttribute("user") %>님의 결제 금액은 <%= count*5000 %>원 입니다.
</body>
</html>


