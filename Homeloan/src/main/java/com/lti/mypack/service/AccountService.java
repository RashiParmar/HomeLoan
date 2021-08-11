package com.lti.mypack.service;

import com.lti.mypack.model.Account;

public interface AccountService {
	public Account findAccount(int accountid);
	public Account findAccount1(String applicationid);
}
