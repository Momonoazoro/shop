package com.lyreco.shop.model;

public class SbLine {

	/**
	 * @param quantity
	 * @param unitPrice
	 * @param sellPrice
	 * @param promotion
	 */
	int quantity;
	double unitPrice;
	double sellPrice;
	String promotion;

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice
	 *            the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the sellPrice
	 */
	public double getSellPrice() {
		return sellPrice;
	}

	/**
	 * @param sellPrice
	 *            the sellPrice to set
	 */
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * @return the promotion
	 */
	public String getPromotion() {
		return promotion;
	}

	/**
	 * @param promotion
	 *            the promotion to set
	 */
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	/**
	 * SBLINE CONSTRUCTOR
	 */
	public SbLine(int quantity, double unitPrice, double sellPrice, String promotion) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.sellPrice = sellPrice;
		this.promotion = promotion;
	}

}
