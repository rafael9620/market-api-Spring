package com.market.domain.service;

import com.market.domain.Product;
import com.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryById) {
        return productRepository.getByCategory(categoryById);
    }

    public Optional<List<Product>> getScarseProducts(int quantity) {
        return productRepository.getScarseProducts(quantity);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Boolean delete(int porductId){
        return getProduct(porductId).map(product -> {
            productRepository.delete(porductId);
            return true;
        }).orElse(false);
    }
}
