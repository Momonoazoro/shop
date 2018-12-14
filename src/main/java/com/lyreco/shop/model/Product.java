package com.lyreco.shop.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends SbLine {

	private String id;
	private String title;
	private String description;
	private double purchasePrice;
	private String category;
	private String brand;
	private int stock;

	public Product(String id, String title, String description, double purchasePrice, String category, String brand, int stock,
			int quantity, double unitPrice, double sellPrice, String promotion) {
		super(quantity, unitPrice, sellPrice, promotion);
		this.id = id;
		this.title = title;
		this.description = description;
		this.purchasePrice = purchasePrice;
		this.category = category;
		this.brand = brand;
		this.stock = stock;
	}

}