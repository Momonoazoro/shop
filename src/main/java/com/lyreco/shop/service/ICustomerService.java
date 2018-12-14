package com.lyreco.shop.service;

import com.lyreco.shop.bean.Customer;
import java.util.Optional;

public interface ICustomerService {

    void createCustomer(Customer customer);

    Optional<Customer> getCustomer(Long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
