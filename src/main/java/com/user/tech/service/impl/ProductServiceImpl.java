package com.user.tech.service.impl;

import com.user.tech.model.Product;
import com.user.tech.repo.ProductRepository;
import com.user.tech.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> product= productRepository.findById(id);
        if(!product.isEmpty()){
            return product.get();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
         productRepository.delete(product);
    }
}
