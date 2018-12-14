package com.lyreco.shop.model;

import java.util.Date;

public class Order {
	/**
	 * @param orderNo
	 * @param shoppingBasket
	 * @param delivered
	 * @param ordered
	 * @param deliveryAddress
	 * @param billingAddress
	 */
	String orderNo;
	ShoppingBasket shoppingBasket;
	Date delivered;
	Date ordered;
	String deliveryAddress;
	String billingAddress;

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the shoppingBasket
	 */
	public ShoppingBasket getShoppingBasket() {
		return shoppingBasket;
	}

	/**
	 * @param shoppingBasket
	 *            the shoppingBasket to set
	 */
	public void setShoppingBasket(ShoppingBasket shoppingBasket) {
		this.shoppingBasket = shoppingBasket;
	}

	/**
	 * @return the delivered
	 */
	public Date getDelivered() {
		return delivered;
	}

	/**
	 * @param delivered
	 *            the delivered to set
	 */
	public void setDelivered(Date delivered) {
		this.delivered = delivered;
	}

	/**
	 * @return the ordered
	 */
	public Date getOrdered() {
		return ordered;
	}

	/**
	 * @param ordered
	 *            the ordered to set
	 */
	public void setOrdered(Date ordered) {
		this.ordered = ordered;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @param deliveryAddress
	 *            the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress
	 *            the billingAddress to set
	 */
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * ORDER CONSTRUCTOR
	 */
	public Order(String orderNo, ShoppingBasket shoppingBasket, Date delivered, Date ordered, String deliveryAddress,
			String billingAddress) {
		super();
		this.orderNo = orderNo;
		this.shoppingBasket = shoppingBasket;
		this.delivered = delivered;
		this.ordered = ordered;
		this.deliveryAddress = deliveryAddress;
		this.billingAddress = billingAddress;
	}

}
