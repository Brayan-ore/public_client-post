package com.bootcamp.public_servicecreditcard.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.public_servicecreditcard.model.dao.CreditCard;

public interface CreditCardCrudRepository extends ReactiveCrudRepository<CreditCard, String>{

}
