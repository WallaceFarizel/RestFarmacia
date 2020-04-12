package br.com.farmacia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.farmacia.model.negocio.Rede;
import br.com.farmacia.model.service.RedeService;

@Controller
public class RedeController {
	
	@Autowired
	private RedeService service;
	
	@RequestMapping(value = "/redes", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("redesLista", service.obterLista());
		
		return "rede/lista";
	}
	
	@RequestMapping(value = "/rede", method = RequestMethod.GET)
	public String showDetalhe() {	
		return "rede/detalhe";
	}
	
	@RequestMapping(value = "/rede", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Rede rede
			) {
		
		service.incluir(rede);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/rede/lojas/{id_Rede}", method = RequestMethod.GET)
	public String listarLojas(Model model, Rede rede, @PathVariable Integer id_Rede) {
		
		Optional<Rede> opt = service.obterPorId(id_Rede);
		
		rede = opt.get();
		
		model.addAttribute("listaLojas", rede.getLojas());
		
		return this.listaDeLojas(model);
	}
	
	@RequestMapping(value = "/rede/lojas", method = RequestMethod.POST)
	public String listaDeLojas(Model model) {
		return "rede/lojas";
	}
	
	@RequestMapping(value = "/rede/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public RedeService getService() {
		return service;
	}
	public void setService(RedeService service) {
		this.service = service;
	}
}