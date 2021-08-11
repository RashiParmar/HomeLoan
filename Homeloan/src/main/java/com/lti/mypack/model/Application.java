package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class Application {

	@Id
	private String applicationid;
	private int custid;
	private String propertyname;
	private String propertylocation;
	private float estimatedamount;
	private String loanstatus;
	public String getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public String getPropertylocation() {
		return propertylocation;
	}
	public void setPropertylocation(String propertylocation) {
		this.propertylocation = propertylocation;
	}
	public float getEstimatedamount() {
		return estimatedamount;
	}
	public void setEstimatedamount(float estimatedamount) {
		this.estimatedamount = estimatedamount;
	}
	public String getLoanstatus() {
		return loanstatus;
	}
	public void setLoanstatus(String loanstatus) {
		this.loanstatus = loanstatus;
	}
	public Application(String applicationid, int custid, String propertyname, String propertylocation,
			float estimatedamount, String loanstatus) {
		super();
		this.applicationid = applicationid;
		this.custid = custid;
		this.propertyname = propertyname;
		this.propertylocation = propertylocation;
		this.estimatedamount = estimatedamount;
		this.loanstatus = loanstatus;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
