package com.lyreco.shop.service.impl;

import com.lyreco.shop.bean.Order;
import com.lyreco.shop.repository.OrderRepository;
import com.lyreco.shop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderService implements IOrderService {

	@Autowired
	private OrderRepository orderRepository;

	public void createOrder(Order order) {
		orderRepository.save(order);
	}

	public Optional<Order> getOrder(Long id) {
		return orderRepository.findById(id);
	}

	public void updateOrder(Order order) {
		orderRepository.save(order);
	}

	public void deleteOrder(Order order) {
		orderRepository.deleteById(order.getId());
	};

}
