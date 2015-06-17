package com.aavn.sample.services.impl;

import org.springframework.stereotype.Service;

import com.aavn.sample.domain.Customer;
import com.aavn.sample.services.interfaces.IPaymentService;

@Service
public class PaymentService implements IPaymentService {
	
	@Override
	public void makePaymentFor(Customer customer, double totalAmount) {
		double totalDiscount = customer.getDiscountForService(totalAmount);
		double totalHasToPay = totalAmount - totalDiscount;
		StringBuilder message = new StringBuilder(customer.getClass().getSimpleName());
		message.append(" has to pay: ").append(totalHasToPay);
		System.out.println(message);
	}
}
