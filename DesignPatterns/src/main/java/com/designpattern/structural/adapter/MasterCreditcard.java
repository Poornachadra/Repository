package com.designpattern.structural.adapter;

public class MasterCreditcard implements CreditCard {

	@Override
	public void populateBankDetails() {
		
	}

	@Override
	public String getCreditCard() {
		return "MasterCreditCard";
	}

}
