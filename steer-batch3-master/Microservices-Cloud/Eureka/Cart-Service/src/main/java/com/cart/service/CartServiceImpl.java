package com.cart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.dao.CartDao;
import com.cart.model.ItemLine;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartDao cartDao;

	@Override
	public ItemLine save(String user, ItemLine itemLine) {
		// TODO Auto-generated method stub
		return cartDao.save(user, itemLine);
	}

	@Override
	public List<ItemLine> findAll(String user) {
		// TODO Auto-generated method stub
		return cartDao.findAll(user);
	}

	@Override
	public void clearCart(String user) {
		cartDao.clearCart(user);
	}

}
