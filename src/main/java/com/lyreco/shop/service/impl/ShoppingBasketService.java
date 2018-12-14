package com.lyreco.shop.service.impl;

import com.lyreco.shop.bean.Customer;
import com.lyreco.shop.bean.Product;
import com.lyreco.shop.bean.SbLine;
import com.lyreco.shop.repository.ProductRepository;
import com.lyreco.shop.service.IShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ShoppingBasketService implements IShoppingBasketService {

    @Autowired
    private ProductRepository productRepository;

	public SbLine checkSbLine(final Customer customer, final Long id, final int quantity) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()){
            if(product.get().getStock() >= quantity){
                double price = 0d;
                if (customer.isPremium()){
                    price = product.get().getPurchasePrice() * 1.15;
                }else {
                    price = product.get().getPurchasePrice() * 1.30;
                }

                return new SbLine(product.get(), quantity, price);
            }
        }

        return null;
	}

	public void removeToShoppingBasket(Long id) {

	}

	public void updateQuantity(final Long id, final int quantity) {

	}
}
