package com.aavn.sample.domain;

public class Customer {

	public static final int PREMIUM = 1;
	public static final int GOLD = 2;
	public static final int SILVER = 3;
	
	private int customerType;

	public double getDiscountForService(double totalAmount) {
		if (customerType == PREMIUM) {
			return totalAmount * 0.2;
		} else if (customerType == GOLD) {
			return totalAmount * 0.15;
		} else if (customerType == SILVER) {
			return totalAmount * 0.1;
		} else {
			return 0.0;
		}
	}
	
	public int getCustomerType() {
		return customerType;
	}

	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}
	
}
