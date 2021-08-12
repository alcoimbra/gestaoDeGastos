package br.com.gestaoDeGastos.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.gestaoDeGastos.model.GastosDTO;

public interface GastosRepository extends MongoRepository<GastosDTO, Long>{
	
	List<GastosDTO> findByDate(Date dataStart, Date dataEnd);
}