package com.designpattern.structural.adapter;

public class BankCustomerAdapter extends BankDetails implements CreditCard {

	BankDetailsInterface bankDetails;
	
	public void getDetails(String name){
		if("SBI".equalsIgnoreCase(name)){
			bankDetails = new SBIBankDetails();
		}
	}

	@Override
	public void populateBankDetails() {
		setAccountName("ABCD");
		setAccountNumber(1234);
		setBankName("SBI");
	}

	@Override
	public String getCreditCard() {
		return "AccountNumber : "+getAccountNumber() + " AccountName : "+getAccountName();
	}
}
