package com.packt.webstore.service;

import com.packt.webstore.domain.Product;

import java.util.List;

public interface ProductService {
    void updateAllStock();
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    Product getProductById(String productID);
}
