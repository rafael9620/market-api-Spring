package com.market.domain.repository;

import com.market.domain.Product;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;


public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
