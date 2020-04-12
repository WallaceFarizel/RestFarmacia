# Como usar:

=> Rede

obterLista: GET http://localhost:8080/api/rede

incluir: POST http://localhost:8080/api/rede
{
	"nome" : "Pacheco",
	"slogan" : "nhanhanha",
	"anoDeCriacao" : 1915
}

excluir: DELETE http://localhost:8080/api/rede/1

===============================

=> Pharmacos

obterLista: GET http://localhost:8080/api/pharmacos

incluir: POST http://localhost:8080/api/pharmacos

{
	"tipoProduto": "Pharmacos"
	"nome": "Dorflex",
	"preco": "3,50",
	"validade": "22/5/2021",
	"formula": "Dipirona 1g",
	"laboratorio": "Sanofi",
	"controlado": false
}

excluir: DELETE http://localhost:8080/api/pharmacos/1

=============================

=> Beleza

obterLista: GET http://localhost:8080/api/beleza

incluir: POST http://localhost:8080/api/beleza

{
	"tipoProduto": "Beleza",
	"nome": "Shampoo Anti-Caspa",
	"preco": 14.9,
	"validade": "22/7/2023",
	"marca": "Dove",
	"descricao": "Shampoo para auxílio no combate as caspas",
	"promocao": false
}

excluir: DELETE http://localhost:8080/api/beleza/1


=============================

=> Loja

obterLista: GET http://localhost:8080/api/loja

incluir: POST http://localhost:8080/api/loja

{ 
	"local": "Rua Ender, 181",
	"horarioFuncionamento": "7h - 22h",
	"entregaEmCasa": true,
	"valorTotal": "1000",
	"responsavel": {
	"nome" : "Pacheco",
	"slogan" : "nhanhanha",
	"anoDeCriacao" : "1915" 
	}, "produtos": [
	{
	"tipoProduto": "Pharmacos",
	"nome": "Paracetamol",
	"preco": 3.50,
	"validade": "19/8/2021",
	"formula": "Paracetamol 500mg",
	"laboratorio": "EMS",
	"controlado": false
	},
	{
	"tipoProduto": "Beleza",
	"nome": "Condicionador liso extremo",
	"preco": 14.9,
	"validade": "11/7/2023",
	"marca": "Dove",
	"descricao": "Condicionador para cabelos lisos",
	"promocao": true
	}]
}

