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

import br.com.farmacia.model.negocio.Rede;
import br.com.farmacia.model.service.RedeService;

@RestController
@RequestMapping("/api/rede/")
public class RedeController {
	
	@Autowired
	private RedeService service;
	
	@RequestMapping
	public List<Rede> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Rede> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Rede rede) {
		service.incluir(rede);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public RedeService getService() {
		return service;
	}
	public void setService(RedeService service) {
		this.service = service;
	}
}
