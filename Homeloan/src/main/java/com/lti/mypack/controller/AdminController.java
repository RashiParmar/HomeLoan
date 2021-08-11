package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Admin;
import com.lti.mypack.service.AccountService;
import com.lti.mypack.service.AdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	AccountService accService;
	
	@GetMapping("/admin")
	public List<Admin> getAll()
	{
		return adminService.getAdmin();
	}
	
	
	
	
	@GetMapping("/byapplicationId/{applicationid}")
	public Account getAdminByApplicationid(@PathVariable(value="applicationid") String applicationid)
	{
		return accService.findAccount1(applicationid);
	}
}