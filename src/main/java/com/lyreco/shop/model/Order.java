package com.lyreco.shop.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {

	private String orderNo;
	private ShoppingBasket shoppingBasket;
	private Date delivered;
	private Date ordered;
	private String deliveryAddress;
	private String billingAddress;

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
