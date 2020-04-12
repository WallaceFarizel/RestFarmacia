<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: lista redes</title>
</head>
<body>
	<h4><a href="/home">Início</a></h4>
	<br> <br> <br>
	
	Listagem de redes:
	
	<c:forEach var="rede" items="${redesLista}">
		<h4>${rede.nome} - ${rede.slogan} 
			<a href="/rede/excluir/${rede.id}">excluir - </a>
			<a href="/rede/lojas/${rede.id}">lojas </a>
		</h4>
	</c:forEach>
	
	<h4><a href="/rede">Adicionar nova rede de lojas</a></h4>
	
</body>
</html>