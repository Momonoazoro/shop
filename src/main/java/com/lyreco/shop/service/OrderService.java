package com.lyreco.shop.service;

import com.lyreco.shop.model.Order;

import java.util.ArrayList;
import java.util.List;

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
	public void createOrder(Order order) {
		if (order != null) {
			if (getOrder(order.getOrderNo()) == null) {
				listOrder.add(order);
			}
		}
	};

	/**
	 * @param orderNo
	 * @return
	 */
	public Order getOrder(String orderNo) {
		for (Order order : listOrder) {
			if (orderNo == order.getOrderNo()) {
				return order;
			}
		}
		return null;
	};

	/**
	 * @param order
	 */
	public void updateOrder(Order order) {
		if (order != null) {
			Order o = getOrder(order.getOrderNo());

			if (o != null) {

				listOrder.remove(o);
				listOrder.add(order);

			}
		}
	};

	/**
	 * @param order
	 */
	public void deleteOrder(Order order) {
		if (order != null) {
			Order o = getOrder(order.getOrderNo());

			if (o != null) {

				listOrder.remove(o);
			}
		}
	};

}
