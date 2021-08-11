package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Document;
import com.lti.mypack.service.AccountService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class AccountController {
	
	@Autowired
	AccountService aService;
	
	@GetMapping("/account/{accountid}")
	public Account showAccount(@PathVariable(value="accountid")int accountid){
		return aService.findAccount(accountid);
		
	}
	
	

}
