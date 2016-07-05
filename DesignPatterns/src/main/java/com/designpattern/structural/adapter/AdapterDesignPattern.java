package com.designpattern.structural.adapter;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		CreditCard card = new BankCustomerAdapter();
		card.populateBankDetails();
		System.out.println(card.getCreditCard());
	}
}
