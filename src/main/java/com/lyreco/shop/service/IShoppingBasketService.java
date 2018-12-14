package com.lyreco.shop.service;

import com.lyreco.shop.bean.Customer;
import com.lyreco.shop.bean.SbLine;

public interface IShoppingBasketService {

    SbLine checkSbLine(final Customer customer, final Long id, final int quantity);

    void removeToShoppingBasket(Long id);

    void updateQuantity(final Long id, final int quantity);
}
