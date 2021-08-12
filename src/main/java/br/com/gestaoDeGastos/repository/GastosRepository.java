package br.com.gestaoDeGastos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.gestaoDeGastos.model.GastosDTO;

public interface GastosRepository extends MongoRepository<GastosDTO, Long>{

}