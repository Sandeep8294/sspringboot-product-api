package com.user.tech.controller;

import com.user.tech.model.Product;
import com.user.tech.reqResp.ProductRequest;
import com.user.tech.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService ;

    @PostMapping("/create")
    public ResponseEntity createProduct(@Valid @RequestBody ProductRequest productRequest){
        val product = new Product();
        BeanUtils.copyProperties(productRequest, product);
        val createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        Product Product = productService.getProductById(id);
        return new ResponseEntity<>(Product, HttpStatus.OK);
    }

    @GetMapping("/fetch-all")
    public ResponseEntity<List<Product>> getAllUsers(){
        List<Product> Products = productService.getAllProducts();
        return new ResponseEntity<>(Products, HttpStatus.OK);
    }


    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id,
                                           @RequestBody Product Product){
        Product.setId(id);
        Product updatedUser = productService.updateProduct(Product);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id){
        Product Product = productService.getProductById(id);
        productService.deleteProduct(Product);
        return new ResponseEntity<>("Product successfully deleted!", HttpStatus.OK);
    }
}
