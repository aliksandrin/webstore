package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import com.packt.webstore.exception.ProductNotFoundException;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class CategoryValidator implements ConstraintValidator<Category, String> {
    @Autowired
    private ProductService productService;

    public void initialize(Category constraintAnnotation) {
// intentionally left blank; this is the place to initialize the constraint annotation for any sensible default values.
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        List<Product> products;
        try {
            products = productService.getProductsByCategory(value);
        } catch (ProductNotFoundException e) {
            return false;
        }
        if (products.isEmpty()) {
            return false;
        }
        return true;
    }
}
