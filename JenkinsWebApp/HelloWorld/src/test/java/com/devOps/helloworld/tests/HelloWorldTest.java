package com.devOps.helloworld.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.devOps.helloworld.Model.User;

public class HelloWorldTest {

	/*
	@Test
	public void testController(){
		System.out.println("Welcome");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mayamehta\\Desktop\\DevOps\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/HelloWorld");
		Assert.assertTrue(driver.getTitle().contains("DevOps"));
		System.out.println(driver.getTitle());
		driver.quit();
		
		Assert.assertTrue(true);
	}
	*/
	
	@Test
	public void testUserFirstName(){
		
		User user = new User();
		user.setFirstName("John");
		Assert.assertTrue(user.getFirstName().equals("John"));
	}
	
	@Test
	public void testUserLastName(){
		
		User user = new User();
		user.setLastName("Doe");
		Assert.assertTrue(user.getLastName().equals("Doe"));
	}
	
	@Test
	public void testUserAddress(){
		
		User user = new User();
		user.setAddress1("123 x Street");
		Assert.assertTrue(user.getAddress1().equals("123 x Street"));
	}
	
	@Test
	public void testUserZipcode(){
		
		User user = new User();
		user.setZipcode("20109");
		Assert.assertTrue(user.getZipcode().equals("20109"));
	}
	
	@Test
	public void testUserTitle()
	{
		User user = new User();
		user.setTitle("Consultant");
		Assert.assertTrue(user.getTitle().equals("Consultant"));
	}
	
	@Test
	public void testUserEmail()
	{
		User user = new User();
		user.setEmail("email@email.com");
		Assert.assertTrue(user.getEmail().equals("email@email.com"));
	}
	
	@Test
	public void testUserPhoneNumber()
	{
		User user = new User();
		user.setPhoneNumber("+1-123-123-1234");
		Assert.assertTrue(user.getPhoneNumber().equals("+1-123-123-1234"));
	}


}
