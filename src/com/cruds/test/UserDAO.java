package com.cruds.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cruds.db.DBConnectionManager;

public class UserDAO {
	
	public boolean authenticate2(String username, String password)
	{
		String sql = "select 1 from user where username=? and pwd=?";
		
		boolean found = false;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs != null && rs.next())
			{
				found = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return found;
		
	}
	
	public boolean authenticate(String username, String password)
	{
		String sql = "select 1 from user where username ='" 
						+ username + "' and pwd='" + password + "'";
		
		boolean found = false;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs != null && rs.next())
			{
				found = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return found;
		
	}

}
