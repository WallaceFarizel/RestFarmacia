<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: lojas da rede</title>
</head>
<body>
	<h4><a href="/home">Início</a></h4>
	<br> <br> <br>
	
	Lojas:
	
	<c:forEach var="loja" items="${listaLojas}">
		<h4>${loja.rede.nome} ${loja.local} - <a href="/loja/excluir/${loja.id}"> - excluir </a>
		</h4>
	</c:forEach>

</body>
</html>