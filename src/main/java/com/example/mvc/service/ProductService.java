package com.example.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.example.mvc.entity.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private static List<Product> products = new ArrayList<Product>() {
        {
            add(new Product(System.currentTimeMillis(), "001", "Product 001", 1000.0));
            add(new Product(System.currentTimeMillis(), "002", "Product 002", 2000.0));
            add(new Product(System.currentTimeMillis(), "003", "Product 003", 3000.0));
            add(new Product(System.currentTimeMillis(), "004", "Product 004", 4000.0));
            add(new Product(System.currentTimeMillis(), "005", "Product 005", 5000.0));
        }
    };

    public List<Product> findAll() {
        return products;
    }

    public void addProduct(Product product) {
        product.setId(System.currentTimeMillis());
        products.add(product);
    }
}
