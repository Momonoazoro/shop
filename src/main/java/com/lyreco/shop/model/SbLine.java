package com.lyreco.shop.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SbLine {

	private int quantity;
	private double unitPrice;
	private double sellPrice;
	private String promotion;

	public SbLine(int quantity, double unitPrice, double sellPrice, String promotion) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.sellPrice = sellPrice;
		this.promotion = promotion;
	}

}
