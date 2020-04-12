<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: lista lojas</title>
</head>
<body>
	<h4><a href="/home">Início</a></h4>
	<br> <br> <br>

	Listagem de lojas:
	
	<c:forEach var="loja" items="${lojasLista}">
		<h4>${loja.rede.nome} ${loja.local}<a href="/loja/excluir/${loja.id}">excluir</a></h4>
	</c:forEach>
	
	<h4><a href="/loja">Adicionar nova loja</a></h4>
	
</body>
</html>