package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.mypack.model.Customer;




public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	/* public String addvalues(Personal personal); */

	
}