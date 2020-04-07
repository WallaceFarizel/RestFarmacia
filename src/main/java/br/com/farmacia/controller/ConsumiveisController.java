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

import br.com.farmacia.model.negocio.Consumiveis;
import br.com.farmacia.model.service.ConsumiveisService;

@RestController
@RequestMapping("/api/consumiceis/")
public class ConsumiveisController {
	
	@Autowired
	private ConsumiveisService service;
	
	@RequestMapping
	public List<Consumiveis> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Consumiveis> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Consumiveis consumiveis) {
		service.incluir(consumiveis);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public ConsumiveisService getService() {
		return service;
	}
	public void setService(ConsumiveisService service) {
		this.service = service;
	}
}
