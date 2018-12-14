package com.lyreco.shop.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Customer {

	private String id;
	private String firstname;
	private String lastname;
	private String address;
	private String zipcode;
	private String city;
	private String mail;
	private String phone;
	private Date birthdate;
	private String password;
	private boolean premium;

	public Customer(String id, String firstname, String lastname, String address, String zipcode, String city, String mail, String phone,
			Date birthdate, String password, boolean premium) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.mail = mail;
		this.phone = phone;
		this.birthdate = birthdate;
		this.password = password;
		this.premium = premium;
	}

}
