package com.lyreco.shop.repository;

import com.lyreco.shop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
