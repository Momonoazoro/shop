package com.lyreco.shop.repository;

import com.lyreco.shop.bean.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByTitle(final String title);

    List<Product> findByCategory(final String category);

}
