
package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.loanDetails;

public interface loanDetailsService {
	
	public List<loanDetails> getloanDetails();
	
	public boolean addloanDetails(loanDetails loandetails);
	
	public boolean updateloanDetails(loanDetails loandetails);
	
	public loanDetails findloanDetails(String loanid);

}