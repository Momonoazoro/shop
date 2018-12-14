package com.lyreco.shop.service;

import com.lyreco.shop.bean.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    void createProduct(Product product);

    Optional<Product> getProduct(Long id);

    void updateProduct(Product product);

   void deleteProduct(Long id);

    Optional<Product> searchById(Long id);

    List<Product> searchByTitle(String title);

    List<Product> searchByCategory(String category);
}
