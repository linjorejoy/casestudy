package com.cognizant.truyum.dao;

import java.util.ArrayList;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {
	private static Map<Long, Cart> userCarts;
	
	public CartDaoCollectionImpl() {
		super();
		if(this.userCarts == null) {
			userCarts = new HashMap<Long, Cart>();
		}
	}	
	

	public Map<Long, Cart> getUserCarts() {
		return userCarts;
	}

	public void setUserCarts(Map<Long, Cart> userCarts) {
		this.userCarts = userCarts;
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {
		
		// TODO Auto-generated method stub
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem item = menuItemDao.getMenuItem(menuItemId);
		
		if(this.userCarts.containsKey(userId)) {
			List<MenuItem> menuItemList = this.userCarts.get(userId).getMenuItemList();
			menuItemList.add(item);
			this.userCarts.get(userId).setMenuItemList(menuItemList);
		}else {
			List<MenuItem> newUserMenuList = new ArrayList<>();
			newUserMenuList.add(item);
			Cart cart = new Cart(newUserMenuList);
			this.userCarts.put(userId, cart);
		}
		
		
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		// TODO Auto-generated method stub
		Cart cart = this.userCarts.get(userId);
		List<MenuItem> allCartItems = cart.getMenuItemList();
		if(allCartItems.isEmpty()) {
			throw new CartEmptyException();
		}else {
			double total = 0;
			for(MenuItem item : allCartItems) {
				total += item.getPrice();
			}
			cart.setTotal(total);
		}
		return allCartItems;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		Cart cart = this.userCarts.get(userId);
		List<MenuItem> allCartItems = cart.getMenuItemList();
		MenuItem itemToRemove = null;
		
		for(MenuItem item : allCartItems) {
			if(item.getId() == menuItemId) {
				itemToRemove = item;
				break;
			}
		}
		allCartItems.remove(itemToRemove);
		cart.setMenuItemList(allCartItems);
		this.userCarts.put(userId, cart);
	}
}
