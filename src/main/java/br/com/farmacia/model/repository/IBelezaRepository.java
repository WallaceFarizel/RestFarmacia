package br.com.farmacia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.farmacia.model.negocio.Beleza;

public interface IBelezaRepository extends CrudRepository<Beleza, Integer> {

}
