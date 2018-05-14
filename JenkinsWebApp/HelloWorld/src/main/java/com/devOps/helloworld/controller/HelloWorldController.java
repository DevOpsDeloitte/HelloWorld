package com.devOps.helloworld.controller; 

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.devOps.helloworld.Model.DBConnector;
import com.devOps.helloworld.Model.User;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ModelAndView showMessage(
			@RequestParam(value = "firstName", required = true) String firstName,
			@RequestParam(value = "lastName", required = true) String lastName,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "title", required = true) String title,
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "password1", required = true) String password1,
			@RequestParam(value = "password2", required = true) String password2,
			@RequestParam(value = "address1", required = true) String address1,
			@RequestParam(value = "address2", required = true) String address2,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "state", required = true) String state,
			@RequestParam(value = "zip", required = true) String zip,
			@RequestParam(value = "country", required = true) String country){
		
			ModelAndView mv = new ModelAndView("helloworld");
			
			String message = "Thank you!";
			String message2 = "You have successfully registered.";
			
			User user = new User();
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmail(email);
			user.setPhoneNumber(phoneNumber);
			user.setTitle(title);
			user.setUserName(userName);
			user.setPassword(password1);
			user.setAddress1(address1);
			user.setAddress2(address2);
			user.setCity(city);
			user.setState(state);
			user.setZipcode(zip);
			user.setCountry(country);
			
			DBConnector db = new DBConnector();
			
			try {
				db.writeData(user);
			} catch (Exception e) {
				message2 = "Unable to register";
			}
			
			mv.addObject("message", message);
			mv.addObject("firstName", firstName);
			mv.addObject("lastName", lastName);
			mv.addObject("message2", message2);
			
		return mv;
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ModelAndView showMessage()
	{
		ModelAndView mv = new ModelAndView("users");
		
		DBConnector dB = new DBConnector();
		
		mv.addObject("message", "Users currently registerd");
		
		try
		{
			ArrayList<User> users = dB.readData();
			mv.addObject("usersList", users);
		}
		catch (Exception e)
		{

		}
		
		return mv;
	}
}