package com.lyreco.shop.model;

import lombok.Builder;
import lombok.Data;

@Data
public class SbLine extends Product {

	private int quantity;
	private double sellPrice;

	@Builder
	public SbLine(Long id, String title, String description, double purchasePrice, String category, String brand,
				  int stock, int quantity, double sellPrice) {
		super(id, title, description, purchasePrice, category, brand, stock);


	}

	@Builder
	public SbLine(Product product, int quantity, double sellPrice){
		super(product.getId(), product.getTitle(), product.getDescription(), product.getPurchasePrice(),
				product.getCategory(), product.getBrand(), product.getStock());

		this.quantity = quantity;
		this.sellPrice = sellPrice;
	}

}
