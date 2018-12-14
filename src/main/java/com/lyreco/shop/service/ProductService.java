package com.lyreco.shop.service;

import com.lyreco.shop.model.Product;
import com.lyreco.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {

	private List<Product> products = new ArrayList<Product>();

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/**
	 * CRUD PRODUCT
	 */

	@Autowired
	private ProductRepository productRepository;

	public void createProduct(Product product) {

		productRepository.save(product);

	}

	public Optional<Product> getProduct(String id) {

		return productRepository.findById(id);
	}


	public void updateProduct(Product product) {

		productRepository.save(product);
	}

	public void deleteProduct(String id) {

		productRepository.deleteById(id);
	}

	public List<Product> searchById(String id) {

		List<Product> productsFiltered = new ArrayList<Product>();

		for (Product p : products) {

			if (p.getId() == id) {

				productsFiltered.add(p);
			}
		}

		return productsFiltered;
	}

	public List<Product> searchByName(String title) {

		List<Product> productsFiltered = new ArrayList<Product>();

		for (Product p : products) {

			if (p.getTitle().toLowerCase().contains(title.toLowerCase())) {

				productsFiltered.add(p);
			}
		}

		return productsFiltered;
	}

	public List<Product> searchByCategory(String category) {

		List<Product> productsFiltered = new ArrayList<Product>();

		for (Product p : products) {

			if (p.getCategory().toLowerCase().contains(category.toLowerCase())) {

				productsFiltered.add(p);
			}
		}

		return productsFiltered;
	}

}
