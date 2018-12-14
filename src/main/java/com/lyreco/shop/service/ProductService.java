package com.lyreco.shop.service;

import com.lyreco.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public void createProduct(Product product) {

		if (product != null) {

			if (getProduct(product.getId()) == null) {

				products.add(product);
			}
		}

	}

	@Override
	public Product getProduct(String id) {

		for (Product p : products) {

			if (p.getId() == id) {

				return p;
			}
		}

		return null;
	}

	@Override
	public void updateProduct(Product product) {

		Product p = getProduct(product.getId());

		if (p != null) {

			products.remove(p);
			products.add(product);
		}
	}

	@Override
	public void deleteProduct(String id) {

		Product product = getProduct(id);

		if (product != null) {

			products.remove(product);
		}
	}

	@Override
	public List<Product> searchById(String id) {

		List<Product> productsFiltered = new ArrayList<Product>();

		for (Product p : products) {

			if (p.getId() == id) {

				productsFiltered.add(p);
			}
		}

		return productsFiltered;
	}

	@Override
	public List<Product> searchByName(String title) {

		List<Product> productsFiltered = new ArrayList<Product>();

		for (Product p : products) {

			if (p.getTitle().toLowerCase().contains(title.toLowerCase())) {

				productsFiltered.add(p);
			}
		}

		return productsFiltered;
	}

	@Override
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
