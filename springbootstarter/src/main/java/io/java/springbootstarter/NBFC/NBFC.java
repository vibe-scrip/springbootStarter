package io.java.springbootstarter.NBFC;

import io.java.springbootstarter.Bank.Bank;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class NBFC {
    
	@Id
	private int id;
	private String NbfcName;
	private String location;
	
	@ManyToOne
    private Bank bank;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public NBFC() {
		
	}
	
	public NBFC(int id, String NbfcName, String location, int bankId) {
		super();
		this.id = id;
		this.NbfcName = NbfcName;
		this.location = location;
		this.bank = new Bank(bankId,"","");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNbfcName() {
		return NbfcName;
	}
	public void setNbfcName(String NbfcName) {
		this.NbfcName = NbfcName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
}
