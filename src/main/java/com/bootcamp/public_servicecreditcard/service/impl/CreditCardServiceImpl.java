package com.bootcamp.public_servicecreditcard.service.impl;

import com.bootcamp.public_servicecreditcard.model.dao.CreditCard;
import com.bootcamp.public_servicecreditcard.repository.CreditCardCrudRepository;

import com.bootcamp.public_servicecreditcard.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
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
