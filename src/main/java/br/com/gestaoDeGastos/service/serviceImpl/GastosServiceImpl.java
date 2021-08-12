package br.com.gestaoDeGastos.service.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaoDeGastos.model.GastosDTO;
import br.com.gestaoDeGastos.repository.GastosRepository;
import br.com.gestaoDeGastos.service.GastosService;

@Service
public class GastosServiceImpl implements GastosService {
	
	static final String UNUSED = "unused";
	@Autowired
	private GastosRepository gastosRepository;

	public List<GastosDTO> findByDate(String date) throws ParseException {
		Date dataAtual = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		Date dataFinal = new Date(dataAtual.getTime() + (1000 * 60 * 60 * 24));
		
		return this.gastosRepository.findByDate(dataAtual, dataFinal);
	}
}