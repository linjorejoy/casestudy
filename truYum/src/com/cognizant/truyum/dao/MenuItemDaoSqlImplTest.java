package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoSqlImplTest {
	
	private static MenuItemDaoSqlImpl menuItemDao = new MenuItemDaoSqlImpl();
	
	public static void main(String[] args) {

		testGetMenuItemListAdmin();
		System.out.println();
		testGetMenuItemListCustomer();
		System.out.println();
		testModifyMenuItem();
		testGetMenuItemListAdmin();
	}
	
	public static void testGetMenuItemListAdmin() {
		List<MenuItem> itemAdminList = menuItemDao.getMenuItemListAdmin();
		itemAdminList.forEach(System.out::println);
	}
	
	public static void testGetMenuItemListCustomer() {
		List<MenuItem> itemCustomerList = menuItemDao.getMenuItemListCustomer();
		itemCustomerList.forEach(System.out::println);
	}

	public static void testModifyMenuItem() {
		MenuItem menuItem = new MenuItem(5, "Chocolate", 20.0f, true, new DateUtil().convertToDate("15/03/2017"), "Desert", true);
		menuItemDao.modifyMenuItem(menuItem);
	}
	
	public static void testGetMenuItem() {
		
	}
}


// check changes checked changes
