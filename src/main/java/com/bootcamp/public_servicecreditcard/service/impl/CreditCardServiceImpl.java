package com.bootcamp.public_servicecreditcard.service.impl;

import com.bootcamp.public_servicecreditcard.model.dao.CreditCard;
import com.bootcamp.public_servicecreditcard.repository.CreditCardCrudRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CreditCardServiceImpl {

	private CreditCardCrudRepository repository;
	
	public Flux<CreditCard> findAll() {
        return repository.findAll();
    }

    public Mono<CreditCard> findById(String id) {
        return repository.findById(id);
    }

    public Mono<CreditCard> save(CreditCard creditcard) {
        return repository.save(creditcard);
    }

    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }
	
}
