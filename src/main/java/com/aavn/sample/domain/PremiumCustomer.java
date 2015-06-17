package com.aavn.sample.domain;

public class PremiumCustomer extends Customer {
	
	@Override
	public double getDiscountForService(double totalAmount) {
		return totalAmount * 0.2;
	}
}
