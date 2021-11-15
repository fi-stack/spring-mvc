package com.example.mvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.mvc.entity.Product;
import com.example.mvc.repo.ProductRepo;
import com.example.mvc.utils.RandomNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public Iterable<Product> findAll() {
        return repo.findAll();
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }

    public Optional<Product> findById(long id) {
        return repo.findById(id);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public List<Product> findByName(String keyword) {
        return repo.findByNameContains(keyword);
    }
}
