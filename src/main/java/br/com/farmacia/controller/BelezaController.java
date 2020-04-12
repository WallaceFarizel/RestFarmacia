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

import br.com.farmacia.model.negocio.Beleza;
import br.com.farmacia.model.service.BelezaService;

@RestController
@RequestMapping("api/beleza")
public class BelezaController {

	@Autowired
	private BelezaService service;
	
	@RequestMapping
	public List<Beleza> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Beleza> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Beleza beleza) {
		service.incluir(beleza);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public BelezaService getService() {
		return service;
	}
	public void setService(BelezaService service) {
		this.service = service;
	}
}