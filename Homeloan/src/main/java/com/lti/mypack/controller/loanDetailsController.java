package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.loanDetails;
import com.lti.mypack.service.loanDetailsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class loanDetailsController {

	@Autowired
	loanDetailsService ldService;
	
	@GetMapping("/loandetails")
	public List<loanDetails> getAll()
	{
		return ldService.getloanDetails();
	}
	
	@PostMapping("/loandetails")
	public boolean addloanDetails(@RequestBody loanDetails loandetails) {
		return ldService.addloanDetails(loandetails);
	}
	@GetMapping("/loandetails/{loanid}")
	public loanDetails getloandetailsById(@PathVariable(value="loanid") String loanid)
	{
		return ldService.findloanDetails(loanid);
	}
	
	
}