package br.com.gestaoDeGastos.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GastosDTO {
	
	private String descricao;
	private Double valor;
	private Integer codigoUsuario;
	private Date date;
	
	@Override
	public String toString() {
		return "Gastos Gerados { " +
					"Descrição: " + descricao +
					"Valor: " + valor +
					"Código do Usuario: " + codigoUsuario +
					"Data: " + date +
					" }";
	}
}