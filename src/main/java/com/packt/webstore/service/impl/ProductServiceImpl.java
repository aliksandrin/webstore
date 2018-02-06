package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation
        .Autowired;
import org.springframework.stereotype.Service;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository
        .ProductRepository;
import com.packt.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void updateAllStock() {
        List<Product> allProducts =
                productRepository.getAllProducts();
        for (Product product : allProducts) {
            if (product.getUnitsInStock() < 500)
                productRepository.updateStock
                        (product.getProductId(),
                                product.getUnitsInStock() + 1000);
        }
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        List<Product> list = productRepository.getProductsByCategory(category);
        return list;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = productRepository.getAllProducts();
        return list;
    }

    @Override
    public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
    }

    public List<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }
}