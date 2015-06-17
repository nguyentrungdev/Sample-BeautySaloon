package com.aavn.sample.services.impl;

import org.springframework.stereotype.Service;

import com.aavn.sample.domain.Customer;
import com.aavn.sample.services.interfaces.IBonusPointAccumulable;
import com.aavn.sample.services.interfaces.IPaymentService;

@Service
public class PaymentService implements IPaymentService {
	
	@Override
	public void makePaymentFor(Customer customer, double totalAmount) {
		customer.getDiscountForService(totalAmount);
		if (customer instanceof IBonusPointAccumulable) {
			IBonusPointAccumulable bonusPointCustomer = (IBonusPointAccumulable) customer;
			bonusPointCustomer.increasePoint();
		}
	}
}
