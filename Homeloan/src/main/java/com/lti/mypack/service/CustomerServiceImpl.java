package com.lti.mypack.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.lti.mypack.model.Customer;
import com.lti.mypack.repository.CustomerRepository;




@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public boolean addValue(Customer customer) {
		customerRepo.save(customer);
		return true;
	}
	@Override
	public List<Customer> getCustomer() {
		return customerRepo.findAll();
	}
		
	}