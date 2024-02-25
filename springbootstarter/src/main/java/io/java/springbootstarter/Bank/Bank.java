package io.java.springbootstarter.Bank;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
    
	@Id
	private int id;
	private String bankName;
	private String location;
	
	public Bank() {
		
	}
	
	public Bank(int id, String bankName, String location) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
