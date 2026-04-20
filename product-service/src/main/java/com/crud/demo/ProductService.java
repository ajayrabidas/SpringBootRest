package com.crud.demo;

import com.crud.demo.entity.Product;
import com.crud.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveAllProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public Product updateProduct(Product productDetails) {

//        Product product = productRepository.findById(productDetails.getId()).orElseThrow(() -> new RuntimeException());
        Product product = productRepository.findById(productDetails.getId()).orElseThrow(RuntimeException::new);
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());

        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(RuntimeException::new);
        productRepository.delete(product);

    }


}
