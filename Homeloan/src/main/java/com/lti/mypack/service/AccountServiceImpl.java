package com.lti.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Account;
import com.lti.mypack.repository.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accRepo;
	
	@Override
	public Account findAccount(int accountid) {
		
		return accRepo.findById(accountid).get();
	}

}
