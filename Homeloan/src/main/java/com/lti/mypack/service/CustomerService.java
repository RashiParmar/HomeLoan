package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Customer;



public interface CustomerService {

	public List<Customer> getCustomer();
	public boolean addValue(Customer customer);
	
}