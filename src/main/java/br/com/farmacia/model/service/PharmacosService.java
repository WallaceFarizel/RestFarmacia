package br.com.farmacia.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmacia.model.negocio.Pharmacos;
import br.com.farmacia.model.repository.IPharmacosRepository;

@Service
public class PharmacosService {

	@Autowired
	private IPharmacosRepository repository;
	
	public List<Pharmacos> obterLista(){
		return (List<Pharmacos>)repository.findAll();
	}
	
	public Optional<Pharmacos> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Pharmacos pharmaco) {
		repository.save(pharmaco);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IPharmacosRepository getRepository() {
		return repository;
	}
	public void setRepository(IPharmacosRepository repository) {
		this.repository = repository;
	}
}
