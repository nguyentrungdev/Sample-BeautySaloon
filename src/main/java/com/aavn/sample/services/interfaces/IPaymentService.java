package com.aavn.sample.services.interfaces;

import com.aavn.sample.domain.Customer;

public interface IPaymentService {

	void makePaymentFor(Customer customer, double totalAmount);

}
