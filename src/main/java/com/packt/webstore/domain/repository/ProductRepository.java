package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
    List<Product> getAllProducts();

    void updateStock(String productId, long noOfUnits);

    List<Product> getProductsByCategory(String category);

    Product getProductById(String productID);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    List<Product> filterProducts(String productCategory, Map<String, List<String>> filterPrice, String productBrand);

    void addProduct(Product product);
}