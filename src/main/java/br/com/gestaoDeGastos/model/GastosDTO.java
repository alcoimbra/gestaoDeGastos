package br.com.gestaoDeGastos.model;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "gestao-de-gastos")
@Getter
@Setter
public class GastosDTO {
	
	@Id
	private Long id;
	
	private String descricao;
	private Double valor;
	private Integer codigoUsuario;
	private Date date;
	
	
	public GastosDTO(Long id, String descricao, 
			Double valor, Integer codigoUsuario, 
			Date date) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.codigoUsuario = codigoUsuario;
		this.date = date;
	}
	
	public String maskMoney(Double valor) {
		NumberFormat mask = NumberFormat.getCurrencyInstance(Locale.US);
		
		return mask.format(valor);
	}
	
	public String maskDate(Date date) {
		LocalDateTime mask = LocalDateTime.now();
		
		return mask.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}
	
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