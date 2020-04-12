package br.com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.farmacia.model.negocio.Loja;
import br.com.farmacia.model.negocio.Rede;
import br.com.farmacia.model.service.LojaService;
import br.com.farmacia.model.service.ProdutoService;
import br.com.farmacia.model.service.RedeService;

@Controller
public class LojaController {
	@Autowired
	private LojaService service;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private RedeService redeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return this.showHome();
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String showHome() {
		return "home";
	}
	
	@RequestMapping(value = "/lojas", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		
		model.addAttribute("lojasLista", service.obterLista());
		
		return "loja/lista";
	}
	
	@RequestMapping(value = "/loja", method = RequestMethod.GET)
	public String showDetalhe(
				Model model
			) {
		model.addAttribute("produtosLista", produtoService.obterLista());
		
		return "loja/detalhe";
	}
	
	@RequestMapping(value = "/loja", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Loja loja,
				Rede rede
			) {		

		rede = obterRede(rede, loja);
		
		loja.setRede(rede);
		
		service.incluir(loja);
		
		return this.showLista(model);
	}
	
	public Rede obterRede(Rede rede, Loja loja) {
		List<Loja> lista;
		for(Rede item: redeService.obterLista()) {
			if(rede.equals(item)) {
				rede = item;
				lista = rede.getLojas();
				lista.add(loja);
				rede.setLojas(lista);
				return rede;
			}
		}
		redeService.incluir(rede);
		return rede;
	}
	
	@RequestMapping(value = "/loja/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public LojaService getService() {
		return service;
	}
	public void setService(LojaService service) {
		this.service = service;
	}
}
