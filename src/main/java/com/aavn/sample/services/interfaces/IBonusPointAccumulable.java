package com.aavn.sample.services.interfaces;

public interface IBonusPointAccumulable {
	void increasePoint();
	double getBonusPointBasedOnTotalAmount(double totalAmount);
}
