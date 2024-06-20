package com.coderscampus.security.demo.web;

import com.coderscampus.security.demo.domain.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private List<Product> allProducts = new ArrayList<>();

    public ProductController() {
        allProducts.add(new Product(1, "Apple1", new BigDecimal("19.99")));
        allProducts.add(new Product(2, "Apple2", new BigDecimal("29.99")));
        allProducts.add(new Product(3, "Apple3", new BigDecimal("39.99")));
        allProducts.add(new Product(4, "Apple4", new BigDecimal("49.99")));
        allProducts.add(new Product(5, "Apple5", new BigDecimal("59.99")));
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(allProducts);
    }
}
