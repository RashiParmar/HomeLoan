package com.lti.mypack.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	 private int accountid;
	 private String applicationid;
	 private String ifsccode;
	 private String loanid;
	 private String accountpassword;
	 private float accountbalance;
	 
//	 @OneToMany(mappedBy = "account")
//	 private List<loanDetails> homeloan;
	 
	 
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getLoanid() {
		return loanid;
	}
	public void setLoanid(String loanid) {
		this.loanid = loanid;
	}
	public String getAccountpassword() {
		return accountpassword;
	}
	public void setAccountpassword(String accountpassword) {
		this.accountpassword = accountpassword;
	}
	public float getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(float accountbalance) {
		this.accountbalance = accountbalance;
	}
	public Account(int accountid, String applicationid, String ifsccode, String loanid, String accountpassword,
			float accountbalance) {
		super();
		this.accountid = accountid;
		this.applicationid = applicationid;
		this.ifsccode = ifsccode;
		this.loanid = loanid;
		this.accountpassword = accountpassword;
		this.accountbalance = accountbalance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	 
}
