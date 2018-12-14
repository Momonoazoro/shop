package com.lyreco.shop.model;

public class Product extends SbLine {
	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param purchasePrice
	 * @param category
	 * @param brand
	 * @param stock
	 */
	String id;
	String title;
	String description;
	double purchasePrice;
	String category;
	String brand;
	int stock;

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the purchasePrice
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice
	 *            the purchasePrice to set
	 */
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * PRODUCT CONSTRUCTOR EXTENDS SBLINE
	 */
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