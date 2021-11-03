package com.example.mvc.repo;

import com.example.mvc.entity.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
