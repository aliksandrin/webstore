package com.packt.webstore.service;

import com.packt.webstore.domain.Product;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface ProductService {
    void updateAllStock();

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    Product getProductById(String productID);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    List<Product> filterProducts(String productCategory, Map<String, List<String>> filterPrice, String productBrand);

    void addProduct(Product product);
}
