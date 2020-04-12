package br.com.farmacia.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.negocio.Rede;
import br.com.farmacia.model.repository.IRedeRepository;

@Service
public class RedeService {

	@Autowired
	private IRedeRepository repository;
	
	public List<Rede> obterLista(){
		return (List<Rede>)repository.findAll();
	}
	
	public Optional<Rede> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Rede rede) {
		repository.save(rede);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public IRedeRepository getRepository() {
		return repository;
	}
	public void setRepository(IRedeRepository repository) {
		this.repository = repository;
	}
}
