package com.lyreco.shop.service;

import com.lyreco.shop.model.ShoppingBasket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasketService {

	private List<ShoppingBasket> shoppingBaskets = new ArrayList<ShoppingBasket>();

	/**
	 * @return the list shoppingBaskets
	 */
	public List<ShoppingBasket> getShoppingBaskets() {
		return shoppingBaskets;
	}

	/**
	 * @param list
	 *            shoppingBaskets the listshoppingBaskets to set
	 */
	public void setShoppingBaskets(List<ShoppingBasket> shoppingBaskets) {
		this.shoppingBaskets = shoppingBaskets;
	}

	@Override
	public void createShoppingBasket(ShoppingBasket shoppingBasket) {
		if (shoppingBasket != null) {
			if (getShoppingBasket(shoppingBasket.getId()) == null) {
				shoppingBaskets.add(shoppingBasket);
			}
		}
	}

	@Override
	public ShoppingBasket getShoppingBasket(String id) {
		for (ShoppingBasket shoppingBasket : shoppingBaskets) {
			if (id == shoppingBasket.getId()) {
				return shoppingBasket;
			}
		}
		return null;
	}

	@Override
	public void updateShoppingBasket(ShoppingBasket shoppingBasket) {
		if (shoppingBasket != null) {
			ShoppingBasket sb = getShoppingBasket(shoppingBasket.getId());

			if (sb != null) {

				shoppingBaskets.remove(sb);
				shoppingBaskets.add(shoppingBasket);

			}
		}
	}

	@Override
	public void deleteShoppingBasket(ShoppingBasket shoppingBasket) {
		if (shoppingBasket != null) {
			ShoppingBasket sb = getShoppingBasket(shoppingBasket.getId());

			if (sb != null) {

				shoppingBaskets.remove(sb);
			}
		}
	}

	@Override
	public void addToShoppingBasket(final String id, final int product) {
		if (id != null) {

		}
	}

	@Override
	public void removeToShoppingBasket(String id) {

	}

	@Override
	public void updateQuantity(final String id, final int quantity) {

	}
}
