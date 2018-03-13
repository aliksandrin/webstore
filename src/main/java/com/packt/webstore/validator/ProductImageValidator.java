package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;

public class ProductImageValidator implements Validator{
    private long allowedSize = 10240000;

    @Override
    public boolean supports(Class<?> aClass) {
        return Product.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Product product = (Product) o;
        MultipartFile image = ((Product) o).getProductImage();
        long size = image.getSize();
        if (size !=0 && size > allowedSize) {
            errors.rejectValue("productImage", "com.packt.webstore.validator.productImageValidator");
        }

    }
}
