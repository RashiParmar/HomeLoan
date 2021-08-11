package com.lti.mypack.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="documents")
public class Document {
	@Id
	private int docid;
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	
	
	private int custid;
	private String pancardnum;
	private String aadharcardnum;
	private String voteridnum;
	
//@OneToOne(cascade=CascadeType.ALL)
//@JoinColumn(name="custdocid")
//	private Customer customer;

	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getPancardnum() {
		return pancardnum;
	}
	public void setPancardnum(String pancardnum) {
		this.pancardnum = pancardnum;
	}
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	public String getAadharcardnum() {
		return aadharcardnum;
	}
	public void setAadharcardnum(String aadharcardnum) {
		this.aadharcardnum = aadharcardnum;
	}
	public String getVoteridnum() {
		return voteridnum;
	}
	public void setVoteridnum(String voteridnum) {
		this.voteridnum = voteridnum;
	}
	public Document(int custid, String pancardnum, String aadharcardnum, String voteridnum) {
		super();
		this.custid = custid;
		this.pancardnum = pancardnum;
		this.aadharcardnum = aadharcardnum;
		this.voteridnum = voteridnum;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
