<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de Pharmacos</title>
</head>
<body>
	<h4><a href="/home">Início</a></h4>
	<br> <br> <br>
	
	<h4>Listagem de Remédios:</h4>
	<br> <br>
	<c:forEach var="item" items="${produtos}">
		<h5>${item} <a href="/produto/${item.id}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>