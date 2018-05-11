package com.devOps.helloworld.Model;

import java.sql.*;
import java.util.ArrayList;

public class DBConnector
{
	public ArrayList<User> readData() throws Exception 
	{
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try 
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=DevOps;user=sadevops;password=zb4^1OL7&6mbh/F6T6YS5j!V");
			statement = connect.createStatement();
			resultSet = statement.executeQuery("Select [DevOps].[dbo].[Users].UserName" 
				+ "[DevOps].[dbo].[Users].LastName,"
				+ "[DevOps].[dbo].[Users].FirstName"
				+ "from [DevOps].[dbo].[Users]");
			
			ArrayList<User> users = new ArrayList<User>();
			
			while (resultSet.next())
			{
				User user = new User();
				user.setLastName(resultSet.getString(1));
				user.setFirstName(resultSet.getString(2));
				user.setFirstName(resultSet.getString(3));
				users.add(user);
			}
			
			return users;
			
			
		}
		catch (Exception e)
		{
			throw e;
		}
		finally 
		{

		}
	}
	
	public boolean writeData(User user) throws Exception 
	{
		Connection connect = null;

		try 
		{
			String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DevOps;user=sadevops;password=zb4^1OL7&6mbh/F6T6YS5j!V";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connect = DriverManager.getConnection(connectionUrl);
			
			String sqlStatement = "Insert into [DevOps].[dbo].[Users]"
					+ "(LastName, FirstName, UserName, Password, Address1, Address2, City, State, Country, Zipcode, Title, Email, PhoneNumber) VALUES"
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement p = connect.prepareStatement(sqlStatement);
			
			p.setString(1, user.getLastName());
			p.setString(2, user.getFirstName());
			p.setString(3, user.getUserName());
			p.setString(4,  user.getPassword());
			p.setString(5, user.getAddress1());
			p.setString(6, user.getAddress2());
			p.setString(7, user.getCity());
			p.setString(8, user.getState());
			p.setString(9, user.getCountry());
			p.setString(10, user.getZipcode());
			p.setString(11, user.getTitle());
			p.setString(12, user.getEmail());
			p.setString(13,  user.getPhoneNumber());

			int inserted = p.executeUpdate();
			
			return inserted > 0 ? true: false;	
		}
		
		catch (Exception e)
		{
			throw e;
		}
		finally 
		{

		}
	}
}