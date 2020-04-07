package br.com.farmacia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.farmacia.model.negocio.Pharmacos;

public interface IPharmacosRepository extends CrudRepository<Pharmacos, Integer> {

}
