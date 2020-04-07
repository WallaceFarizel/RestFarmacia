package br.com.farmacia.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.negocio.Loja;
import br.com.farmacia.model.repository.ILojaRepository;

@Service
public class LojaService {

	@Autowired
	private ILojaRepository repository;
	
	public List<Loja> obterLista(){
		return (List<Loja>)repository.findAll();
	}
	
	public Optional<Loja> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Loja loja) {
		repository.save(loja);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public ILojaRepository getRepository() {
		return repository;
	}
	public void setRepository(ILojaRepository repository) {
		this.repository = repository;
	}
}
