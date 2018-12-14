package com.lyreco.shop.model;

import java.util.List;

public class ShoppingBasket {

	/**
	 * @param id
	 * @param totalPrice
	 * @param sbLines
	 */
	String id;
	double totalPrice;
	List<SbLine> sbLines;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice
	 *            the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the sbLines
	 */
	public List<SbLine> getSbLines() {
		return sbLines;
	}

	/**
	 * @param sbLines
	 *            the sbLines to set
	 */
	public void setSbLines(List<SbLine> sbLines) {
		this.sbLines = sbLines;
	}

	/**
	 * SHOPPINGBASKET CONSTRUCTOR
	 */
	public ShoppingBasket(String id, double totalPrice, List<SbLine> sbLines) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.sbLines = sbLines;
	}

}
