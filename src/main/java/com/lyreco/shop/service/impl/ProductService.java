package com.lyreco.shop.service.impl;

import com.lyreco.shop.bean.Product;
import com.lyreco.shop.repository.ProductRepository;
import com.lyreco.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;

	public void createProduct(Product product) { productRepository.save(product); }

	public Optional<Product> getProduct(Long id) { return productRepository.findById(id); }

	public void updateProduct(Product product) { productRepository.save(product); }

	public void deleteProduct(Long id) { productRepository.deleteById(id); }

	public Optional<Product> searchById(Long id) { return productRepository.findById(id); }

	public List<Product> searchByTitle(String title) { return productRepository.findByTitle(title);	}

	public List<Product> searchByCategory(String category) { return productRepository.findByCategory(category);	}

}
