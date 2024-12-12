package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.User;

public class UserDAOImpl implements UserDAO{
	private Connection conn;

	public UserDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean userRegister(User user) {
		boolean f = false;
		
		try {
			String sql = "insert into user(name,email,phonenumber,password) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhonenumber());
			ps.setString(4, user.getPassword());

			int i = ps.executeUpdate();
			if(i == 1) {
				f= true;
			}
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	
}
