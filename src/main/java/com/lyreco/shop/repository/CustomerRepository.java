package com.lyreco.shop.repository;

import com.lyreco.shop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {



}
