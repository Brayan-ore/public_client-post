package com.bootcamp.public_servicecreditcard.model.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class CreditCard {

	@Id
    private String id;
	private String numeroCuenta;
	private Double monto;
	private Double lineaCredito;
	private String tipoMoneda;
	private Boolean estado;
	
}
