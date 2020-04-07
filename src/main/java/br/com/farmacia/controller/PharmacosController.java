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

import br.com.farmacia.model.negocio.Pharmacos;
import br.com.farmacia.model.service.PharmacosService;

@RestController
@RequestMapping("/api/pharmacos/")
public class PharmacosController {
	
	@Autowired
	private PharmacosService service;
	
	@RequestMapping
	public List<Pharmacos> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Pharmacos> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Pharmacos pharmacos) {
		service.incluir(pharmacos);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public PharmacosService getService() {
		return service;
	}
	public void setService(PharmacosService service) {
		this.service = service;
	}
}
