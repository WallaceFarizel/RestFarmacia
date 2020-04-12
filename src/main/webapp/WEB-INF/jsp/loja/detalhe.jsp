<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: detalhe</title>
</head>
<body>
	<h4><a href="/home">Voltar</a></h4>
	<br> <br> <br>
	
	<form action="/loja" method="post">
		Rede: <input type="text" name="nome">
		<br> <br>
		Slogan: <input type="text" name="slogan">
		<br> <br>
		Ano de criação: <input type="text" name="anoDeCriacao">
		<br> <br>
		local: <input type="text" name="local">
		<br> <br>
		Horário de funcionamento :<input type="text" name="horarioFuncionamento">
		<br> <br>
		Entrega em domicílio?	
		<div class="form-check-inline">
     		<label class="form-check-label" for="entregaEmCasa">
        		<input type="radio" class="form-check-input" id="radio1" name="entregaEmCasa" value="true">Sim
    		</label>
    	</div>
    	<div class="form-check-inline">
      		<label class="form-check-label" for="radio2">
        		<input type="radio" class="form-check-input" id="radio2" name="entregaEmCasa" value="false" checked>Não
      		</label>
    	</div>
		<input type="submit" value="Acessar">
	</form>
	
</body>
</html>