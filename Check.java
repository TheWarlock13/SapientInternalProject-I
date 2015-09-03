package com;

public class Check extends Payment implements Authorization {
	private String name;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	private long customerBankId;
	public long getCustomerBankId() {return customerBankId;}
	public void setCustomerBankId(long customerBankId) {this.customerBankId = customerBankId;}

	

}
