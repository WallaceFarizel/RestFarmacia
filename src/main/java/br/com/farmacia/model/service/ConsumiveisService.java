package br.com.farmacia.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.negocio.Consumiveis;
import br.com.farmacia.model.repository.IConsumiveisRepository;

@Service
public class ConsumiveisService {

	@Autowired
	private IConsumiveisRepository repository;
	
	public List<Consumiveis> obterLista(){
		return (List<Consumiveis>)repository.findAll();
	}
	
	public Optional<Consumiveis> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Consumiveis consumiveis) {
		repository.save(consumiveis);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IConsumiveisRepository getRepository() {
		return repository;
	}
	public void setRepository(IConsumiveisRepository repository) {
		this.repository = repository;
	}
}
