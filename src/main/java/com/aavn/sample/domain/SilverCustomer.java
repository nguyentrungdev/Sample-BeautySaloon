package com.aavn.sample.domain;

import com.aavn.sample.services.interfaces.IBonusPointAccumulable;

public class SilverCustomer extends Customer implements IBonusPointAccumulable {
	
	@Override
	public double getDiscountForService(double totalAmount) {
		return totalAmount * 0.1;
	}

	@Override
	public double getBonusPointBasedOnTotalAmount(double totalAmount) {
		double bonusPoint = totalAmount / 10;
		StringBuilder message = new StringBuilder(this.getClass().getSimpleName());
		message.append(": +").append(bonusPoint).append(" point");
		System.out.println(message);
		return bonusPoint;
	}

	@Override
	public void increasePoint() {
		
	}
}
