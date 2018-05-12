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

}
