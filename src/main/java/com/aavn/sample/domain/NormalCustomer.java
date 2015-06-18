package com.aavn.sample.domain;

public class NormalCustomer extends Customer {

	public double getBonusPointBasedOnTotalAmount(double totalAmount) throws Exception  {
		throw new Exception("Not allowed");
	}
}
