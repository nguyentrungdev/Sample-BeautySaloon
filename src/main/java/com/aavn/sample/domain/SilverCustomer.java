package com.aavn.sample.domain;

public class SilverCustomer extends Customer {
	
	@Override
	public double getDiscountForService(double totalAmount) {
		return totalAmount * 0.1;
	}

}
