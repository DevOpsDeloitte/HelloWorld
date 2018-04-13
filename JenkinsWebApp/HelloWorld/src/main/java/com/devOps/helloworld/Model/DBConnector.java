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
			connect = DriverManager.getConnection("jdbc:sqlserver://localhost;user=sadevops;password=zb4^1OL7&6mbh/F6T6YS5j!V");
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
	
	public void writeData() throws Exception 
	{
		Connection connect = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try 
		{
			String connectionUrl = "jdbc:sqlserver://10.118.45.4:1433;databaseName=DevOps;user=sadevops;password=zb4^1OL7&6mbh/F6T6YS5j!V";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connect = DriverManager.getConnection(connectionUrl);
			statement = connect.createStatement();
			
			String sqlStatement = "Insert into [DevOps].[dbo].[Users] VALUES ('2', 'DOE', 'John', 'jdoe', 'jdoe1', '123 some street', '','Somecity', 'va', 'USA', '22121', 'notitle', 'xxx', '111');";
			resultSet = statement.executeQuery(sqlStatement);
			
			
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