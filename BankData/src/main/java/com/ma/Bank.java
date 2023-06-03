package com.ma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Automatically Table Created
public class Bank
{
	@Id //Automatically Primary key Generated
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Automatic Generate ID
	@Column(name = "branch_id")
	private int id;
	@Column(nullable = false) //False = it accept Not_Null & True = it accept Null
	private String name;
	private String website;
	@Column(unique = true) //True = it accept only Unique & False = it accept Duplicate
	private long phno;
	@Column(length = 10) //Fix the Length/ Size
	private String ifscno;
	private int nobranch;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getIfscno() {
		return ifscno;
	}
	public void setIfscno(String ifscno) {
		this.ifscno = ifscno;
	}
	public int getNobranch() {
		return nobranch;
	}
	public void setNobranch(int nobranch) {
		this.nobranch = nobranch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
