package br.com.farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.farmacia.model.negocio.Beleza;
import br.com.farmacia.model.service.BelezaService;

@Controller
public class BelezaController {

	@Autowired
	private BelezaService service;
	
	@RequestMapping(value = "/produto/belezas", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("belezas", service.obterLista());
		
		return "/produto/beleza/lista";
	}
	
	@RequestMapping(value = "/produto/beleza", method = RequestMethod.GET)
	public String showDetalhe() {
		return "/produto/beleza/detalhe";
	}
	
	@RequestMapping(value = "/produto/beleza", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Beleza beleza
			) {
		
		service.incluir(beleza);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/produto/beleza/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public BelezaService getService() {
		return service;
	}
	public void setService(BelezaService service) {
		this.service = service;
	}
}