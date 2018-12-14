package com.lyreco.shop.bean;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
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

}
