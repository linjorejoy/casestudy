package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImpl implements CartDao {
	private static PreparedStatement preparedStatement = null;
	
	@Override
	public void addCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		try {
			Connection connection = ConnectionHandler.getConnection();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		
	}

}
