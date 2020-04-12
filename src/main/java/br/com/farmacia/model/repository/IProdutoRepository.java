package br.com.farmacia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.farmacia.model.negocio.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}
