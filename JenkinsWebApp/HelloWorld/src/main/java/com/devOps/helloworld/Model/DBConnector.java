package com.devOps.helloworld.Model;

import java.sql.*;

public class DBConnector
{
	public void readData() throws Exception 
	{
		Connection connect = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc://mysql://localhost/");
			statement = connect.createStatement();
			resultSet = statement.executeQuery("Select * from users");
			
			
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