package com.lyreco.shop.service;

import com.lyreco.shop.model.Order;
import com.lyreco.shop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderService {

	List<Order> listOrder = new ArrayList<Order>();

	/**
	 * @return the listOrder
	 */
	public List<Order> getListOrder() {
		return listOrder;
	}

	/**
	 * @param listOrder
	 *            the listOrder to set
	 */
	public void setListOrder(List<Order> listOrder) {
		this.listOrder = listOrder;
	}

	/**
	 * @param order
	 */

	@Autowired
	private OrderRepository orderRepository;


	public void createOrder(Order order) {
				orderRepository.save(order);

	}

	/**
	 * @param orderNo
	 * @return
	 */
	public Optional<Order> getOrder(String orderNo) {

		return orderRepository.findById(orderNo);
	}

	/**
	 * @param order
	 */
	public void updateOrder(Order order) {
		orderRepository.save(order);
	}

	/**
	 * @param order
	 */
	public void deleteOrder(Order order) {
		orderRepository.deleteById(order.getOrderNo());
	};

}
