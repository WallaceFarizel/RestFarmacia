package br.com.farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.farmacia.model.negocio.Produto;
import br.com.farmacia.model.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("produtos", service.obterLista());
		
		return "produto/lista";
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public String showDetalhe() {
		return "produto/detalhe";
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Produto produto
			) {
		
		service.incluir(produto);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/produto/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public ProdutoService getService() {
		return service;
	}
	public void setService(ProdutoService service) {
		this.service = service;
	}
}