package br.com.farmacia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.farmacia.model.negocio.Loja;

public interface ILojaRepository extends CrudRepository<Loja, Integer> {

}
