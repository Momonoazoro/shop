package com.lyreco.shop.model;

import java.util.Date;

public class Customer {

	/**
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param zipcode
	 * @param city
	 * @param mail
	 * @param phone
	 * @param birthdate
	 * @param password
	 * @param premium
	 */
	String id;
	String firstname;
	String lastname;
	String address;
	String zipcode;
	String city;
	String mail;
	String phone;
	Date birthdate;
	String password;
	boolean premium;

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
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate
	 *            the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the premium
	 */
	public boolean isPremium() {
		return premium;
	}

	/**
	 * @param premium
	 *            the premium to set
	 */
	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	/**
	 * CUSTOMER CONSTRUCTOR
	 */
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
