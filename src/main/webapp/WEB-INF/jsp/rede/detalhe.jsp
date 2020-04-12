<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: detalhe rede</title>
</head>
<body>
	<h4><a href="/home">Voltar</a></h4>
	<br> <br> <br>
	
	<form action="/rede" method="post">
		Nome: <input type="text" name="nome">
		<br> <br>
		Slogan: <input type="text" name="slogan">
		<br> <br>
		Ano de fundação: <input type="text" name="anoDeCriacao">
		<br>
		<input type="submit" value="Acessar">
	</form>
</body>
</html>