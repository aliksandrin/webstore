package com.packt.webstore.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.domain.Product;

@Controller
@RequestMapping("market")
public class ProductController {
    @Autowired
    private ProductService productService;

//    @RequestMapping("/products")
//    public String list(Model model) {
//        Product iphone = new Product("P1234", "iPhone 6s", new
//                BigDecimal(500));
//        iphone.setDescription("Apple iPhone 6s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
//        iphone.setCategory("Smartphone");
//        iphone.setManufacturer("Apple");
//        iphone.setUnitsInStock(1000);
//        model.addAttribute("product", iphone);
//        return "products";
//    }

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/update/stock")
    public String updateStock(Model model) {
        productService.updateAllStock();
        return "redirect:/market/products";
    }

    @RequestMapping("/products/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
        model.addAttribute("products",
                productService.getProductsByCategory(productCategory));
        return "products";
    }

    @RequestMapping("/products/filter/{params}")
    public String
    getProductsByFilter(@MatrixVariable(pathVar = "params") Map<String, List<String>> filterParams, Model model) {
        model.addAttribute("products", productService.getProductsByFilter(filterParams));
        return "products";
    }
}