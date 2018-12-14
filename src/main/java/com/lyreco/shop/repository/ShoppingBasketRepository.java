package com.lyreco.shop.repository;

import com.lyreco.shop.model.ShoppingBasket;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingBasketRepository extends CrudRepository<ShoppingBasket, String> {
}
