package com.aavn.sample.domain;

import com.aavn.sample.services.interfaces.IBonusPointAccumulable;

public class PremiumCustomer extends Customer implements IBonusPointAccumulable {
	
	@Override
	public double getDiscountForService(double totalAmount) {
		return totalAmount * 0.2;
	}

	@Override
	public void increasePoint() {
		StringBuilder message = new StringBuilder(this.getClass().getSimpleName());
		message.append(" bonus point +1");
		System.out.println(message);
	}
}
