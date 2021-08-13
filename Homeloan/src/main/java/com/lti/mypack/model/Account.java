package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
    })
    @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
	 private int accountid;
	 private String applicationid;
	 private String ifsccode;
	 private String loanid;
	 private float accountbalance;
	 
//	 @OneToMany(mappedBy = "account")
//	 private List<loanDetails> homeloan;
	 
	 
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
	
	public float getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(float accountbalance) {
		this.accountbalance = accountbalance;
	}
	public Account(int accountid, String applicationid, String ifsccode, String loanid, 
			float accountbalance) {
		super();
		this.accountid = accountid;
		this.applicationid = applicationid;
		this.ifsccode = ifsccode;
		this.loanid = loanid;
	
		this.accountbalance = accountbalance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	 
}
