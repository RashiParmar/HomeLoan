package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Admin;



public interface AdminService {

	public List<Admin> getAdmin();

	public Account findAccount(String applicationid);
	
	
}