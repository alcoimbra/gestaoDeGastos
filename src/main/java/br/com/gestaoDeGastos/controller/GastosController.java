package br.com.gestaoDeGastos.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoDeGastos.domain.Response;
import br.com.gestaoDeGastos.model.GastosDTO;
import br.com.gestaoDeGastos.service.serviceImpl.GastosServiceImpl;
import io.swagger.annotations.Api;


@RestController
@Api(value = "Gastos")
public class GastosController {
	
	@Autowired
	private GastosServiceImpl gastosServiceImpl;
	
	@GetMapping("/gastos/data/{date}")
	public ResponseEntity<Response> gastosPorData(@PathVariable String date) {
		
		try {
			
			List<GastosDTO> gastosRealizadosPorData = this.gastosServiceImpl.findByDate(date);
			
			return new ResponseEntity<Response>(
						new Response(HttpStatus.OK.value(), 
								"Busca dos Gastos Atuais Realizado com Sucesso",
								gastosRealizadosPorData),
				HttpStatus.OK
			);
		} catch (ParseException e) {
			return new ResponseEntity<Response>(
					new Response(HttpStatus.BAD_REQUEST.value(),
							"Data se Encontra no Formato Errado",
							null),
				HttpStatus.BAD_REQUEST
			);
		}
	}
}