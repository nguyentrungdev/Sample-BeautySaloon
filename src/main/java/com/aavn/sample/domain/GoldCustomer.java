package com.aavn.sample.domain;

public class GoldCustomer extends Customer {

	@Override
	public double getDiscountForService(double totalAmount) {
		return (totalAmount * 0.15);
	}
}
