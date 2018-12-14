package com.lyreco.shop.bean;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Order implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String orderNo;
	private ShoppingBasket shoppingBasket;
	private Date delivered;
	private Date ordered;
	private String deliveryAddress;
	private String billingAddress;

}
