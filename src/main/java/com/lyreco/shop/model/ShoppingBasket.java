package com.lyreco.shop.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ShoppingBasket {

	private String id;
	private double totalPrice;
	private List<SbLine> sbLines;

	public ShoppingBasket(String id, double totalPrice, List<SbLine> sbLines) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.sbLines = sbLines;
	}

}
