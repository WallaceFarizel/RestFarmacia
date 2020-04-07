package br.com.farmacia.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.negocio.Beleza;
import br.com.farmacia.model.repository.IBelezaRepository;

@Service
public class BelezaService {

	@Autowired
	private IBelezaRepository repository;
	
	public List<Beleza> obterLista(){
		return (List<Beleza>)repository.findAll();
	}
	
	public Optional<Beleza> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Beleza beleza) {
		repository.save(beleza);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IBelezaRepository getRepository() {
		return repository;
	}
	public void setRepository(IBelezaRepository repository) {
		this.repository = repository;
	}
}
