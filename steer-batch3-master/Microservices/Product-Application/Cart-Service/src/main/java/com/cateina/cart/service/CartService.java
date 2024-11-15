package com.cateina.cart.service;

import java.util.List;

import com.cateina.cart.model.ItemLine;

public interface CartService {

	// save cart Item to the cart
	ItemLine save(String user, ItemLine itemLine);

	// load all cart items
	List<ItemLine> findAll(String user);

	// clear cart for a user
	void clearCart(String user);

}
