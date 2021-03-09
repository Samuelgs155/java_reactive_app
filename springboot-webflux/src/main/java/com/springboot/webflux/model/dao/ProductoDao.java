package com.springboot.webflux.model.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.springboot.webflux.model.document.Producto;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {

}
