package com.lyreco.shop.bean;

import lombok.Data;
import lombok.AllArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Data
@Entity
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	private double purchasePrice;
	private String category;
	private String brand;
	private int stock;

}