package com.lyreco.shop.service;

import com.lyreco.shop.model.Order;
import com.lyreco.shop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderService {

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
