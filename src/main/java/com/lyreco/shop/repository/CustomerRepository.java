package com.lyreco.shop.repository;

import com.lyreco.shop.bean.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
