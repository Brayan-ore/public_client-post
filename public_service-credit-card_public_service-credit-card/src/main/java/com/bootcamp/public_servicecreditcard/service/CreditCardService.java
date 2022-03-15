package com.bootcamp.public_servicecreditcard.service;

import com.bootcamp.public_servicecreditcard.model.dao.CreditCard;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardService {
	
	public Flux<CreditCard> findAll();
    public Mono<CreditCard> findById(String id);
    public Mono<CreditCard> save(CreditCard creditCard);
    public Mono<Void> deleteById(String id);
	
}
