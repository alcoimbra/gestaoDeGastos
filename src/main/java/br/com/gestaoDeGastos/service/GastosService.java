package br.com.gestaoDeGastos.service;

import java.text.ParseException;
import java.util.List;

import br.com.gestaoDeGastos.model.GastosDTO;

public interface GastosService {
	
	public List<GastosDTO> findByDate(String date) throws ParseException;
}