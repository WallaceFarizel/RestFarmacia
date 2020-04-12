<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de produtos</title>
</head>
<body>
	<h4>Listagem de Produtos</h4>
	
	<h4><a href="/home">Início</a> | <a href="/produto/pharmacos">Pharmacos</a> | <a href="/produto/beleza">Produtos de Beleza</a></h4>
	
	<c:forEach var="item" items="${produtos}">
		<h5>${item} <a href="/produto/${item.id}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>