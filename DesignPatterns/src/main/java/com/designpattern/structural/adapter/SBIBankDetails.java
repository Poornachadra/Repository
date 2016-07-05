package com.designpattern.structural.adapter;

public class SBIBankDetails implements BankDetailsInterface {

	@Override
	public String getCustomerName() {
		return "Customer Name : ABCD";
	}

	@Override
	public String getBankName() {
		return "Bank Name : SBI";
	}

}
