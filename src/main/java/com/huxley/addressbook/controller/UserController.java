package com.huxley.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.huxley.addressbook.dto.AddressRequest;
import com.huxley.addressbook.dto.UserRequest;
import com.huxley.addressbook.entity.Address;
import com.huxley.addressbook.entity.User;
import com.huxley.addressbook.repository.AddressRepository;
import com.huxley.addressbook.repository.UserRepository;



@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddressRepository addressRepository;
	
	
	@PostMapping("/addUser")  //so in Postman, your POST request will have customer object in request body
	public User createUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	@PostMapping("/addAddress")  //so in Postman, your POST request will have customer object in request body
	public Address createAddress(@RequestBody Address address)
	{
		return addressRepository.save(address);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> findAllUsers()
	{
		
		return userRepository.findAll();
	}
	
	@GetMapping("/getAllAddresses")
	public List<Address> findAllAddresses()
	{
		
		return addressRepository.findAll();
	}

}
