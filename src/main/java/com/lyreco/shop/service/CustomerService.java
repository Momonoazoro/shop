package com.lyreco.shop.service;

import com.lyreco.shop.model.Customer;

import java.util.ArrayList;
import java.util.Date;

public class CustomerService {

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	@Override
	public Customer createCustomer(String id, String firstname, String lastname, String address, String zipcode, String city, String mail,
			String phone, Date birthdate, String password, boolean premium) {
		if (id != null && firstname != null) {
			Customer customer = new Customer(id, firstname, lastname, address, zipcode, city, mail, phone, birthdate, password, premium);
			customers.add(customer);
		}
		return null;
	}

	@Override
	public Customer getCustomer(String id) {

		for (Customer customer : customers) {

			if (customer.getId() == id) {

				return customer;
			}

		}

		return null;
	}

	@Override
	public void updateCustomer(Customer customer) {

		if (customer != null) {
			Customer c = getCustomer(customer.getId());

			if (customer.getId() != null) {
				customers.remove(c);
				customers.add(customer);
			}
		}

	}

	@Override
	public void deleteCustomer(Customer customer) {

		if (customer != null) {
			if (customer.getId() != null) {
				customers.remove(customer);
			}
		}

	}

	public CustomerService() {

	}

}
