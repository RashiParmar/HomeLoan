package com.lti.mypack.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="homeloan")
public class loanDetails 
{
	@Id
	private String loanid;
	private float loanamt;
	private float maxloanamt;
	private float interestrate;
	private float pendingamt;
	private Date startdate;
	private Date enddate;
	
	@ManyToOne()
	@JoinColumn(name="loanid")
	private Account account;
	
	public String getLoanid() {
		return loanid;
	}
	public void setLoanid(String loanid) {
		this.loanid = loanid;
	}
	public float getLoanamt() {
		return loanamt;
	}
	public void setLoanamt(float loanamt) {
		this.loanamt = loanamt;
	}
	public float getMaxloanamt() {
		return maxloanamt;
	}
	public void setMaxloanamt(float maxloanamt) {
		this.maxloanamt = maxloanamt;
	}
	public float getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(float interestrate) {
		this.interestrate = interestrate;
	}
	public float getPendingamt() {
		return pendingamt;
	}
	public void setPendingamt(float pendingamt) {
		this.pendingamt = pendingamt;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public loanDetails(String loanid, float loanamt, float maxloanamt, float interestrate, float pendingamt,
			Date startdate, Date enddate) {
		super();
		this.loanid = loanid;
		this.loanamt = loanamt;
		this.maxloanamt = maxloanamt;
		this.interestrate = interestrate;
		this.pendingamt = pendingamt;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public loanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}