package com.lyreco.shop.service;

import com.lyreco.shop.model.Customer;
import com.lyreco.shop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class CustomerService {

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	@Autowired
	private CustomerRepository customerRepository;

	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public Optional<Customer> getCustomer(String id) {

		return customerRepository.findById(id);
	}

	public void updateCustomer(Customer customer) {

		customerRepository.save(customer);

	}
	
	public void deleteCustomer(Customer customer) {

		customerRepository.deleteById(customer.getId());

	}

	public CustomerService() {

	}

}
