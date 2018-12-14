package com.lyreco.shop.service.impl;

import com.lyreco.shop.bean.Customer;
import com.lyreco.shop.repository.CustomerRepository;
import com.lyreco.shop.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public Optional<Customer> getCustomer(Long id) {
		return customerRepository.findById(id);
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(Customer customer) {
		customerRepository.deleteById(customer.getId());
	}

}
