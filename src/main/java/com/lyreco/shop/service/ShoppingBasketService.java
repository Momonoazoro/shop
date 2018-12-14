package com.lyreco.shop.service;

import com.lyreco.shop.model.ShoppingBasket;
import com.lyreco.shop.repository.ShoppingBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingBasketService {

	private List<ShoppingBasket> shoppingBaskets = new ArrayList<ShoppingBasket>();

	public List<ShoppingBasket> getShoppingBaskets() {
		return shoppingBaskets;
	}

	public void setShoppingBaskets(List<ShoppingBasket> shoppingBaskets) {
		this.shoppingBaskets = shoppingBaskets;
	}

	@Autowired
	private ShoppingBasketRepository shoppingBasketRepository;

	public void createShoppingBasket(ShoppingBasket shoppingBasket) {
		shoppingBasketRepository.save(shoppingBasket);
	}

	public Optional<ShoppingBasket> getShoppingBasket(String id) {
		return shoppingBasketRepository.findById(id);
	}

	public void updateShoppingBasket(ShoppingBasket shoppingBasket) {
		shoppingBasketRepository.save(shoppingBasket);
	}

	public void deleteShoppingBasket(ShoppingBasket shoppingBasket) {
		shoppingBasketRepository.deleteById(shoppingBasket.getId());
	}

	public void addToShoppingBasket(final String id, final int product) {
		if (id != null) {

		}
	}

	public void removeToShoppingBasket(String id) {

	}

	public void updateQuantity(final String id, final int quantity) {

	}
}
