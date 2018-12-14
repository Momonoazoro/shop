package com.lyreco.shop.service;

import com.lyreco.shop.bean.Order;
import java.util.Optional;

public interface IOrderService {

    void createOrder(Order order);

    Optional<Order> getOrder(Long id);

    void updateOrder(Order order);

    void deleteOrder(Order order);
}
