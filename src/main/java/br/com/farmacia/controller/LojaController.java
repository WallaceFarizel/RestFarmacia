package br.com.farmacia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.farmacia.model.negocio.Loja;
import br.com.farmacia.model.service.LojaService;

@RestController
@RequestMapping("/api/loja/")
public class LojaController {
	
	@Autowired
	private LojaService service;
	
	@RequestMapping
	public List<Loja> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Loja> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Loja loja) {
		service.incluir(loja);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public LojaService getService() {
		return service;
	}
	public void setService(LojaService service) {
		this.service = service;
	}
}
