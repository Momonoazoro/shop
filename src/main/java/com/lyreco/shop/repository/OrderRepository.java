package com.lyreco.shop.repository;

import com.lyreco.shop.bean.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
