package com.lyreco.shop.bean;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Data
public class ShoppingBasket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double totalPrice;
	private List<SbLine> sbLines;

}
