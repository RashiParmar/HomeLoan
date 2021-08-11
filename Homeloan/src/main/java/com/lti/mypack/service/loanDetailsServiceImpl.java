package com.lti.mypack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mypack.model.loanDetails;
import com.lti.mypack.repository.loanDetailsRepository;

@Service
@Transactional
public class loanDetailsServiceImpl implements loanDetailsService {

	@Autowired
	loanDetailsRepository ldrepo;
	
	@Override
	public List<loanDetails> getloanDetails() {
		
		return ldrepo.findAll();
	}

	@Override
	public boolean addloanDetails(loanDetails loandetails) {
		ldrepo.save(loandetails);
		return true;
	}

	@Override
	public boolean updateloanDetails(loanDetails loandetails) {
		loanDetails newld=ldrepo.findById(loandetails.getLoanid()).get();
		newld=loandetails;
		ldrepo.save(newld);
		return true;
	}

	@Override
	public loanDetails findloanDetails(String loanid) {
		
		return ldrepo.findById(loanid).get();
	}

}