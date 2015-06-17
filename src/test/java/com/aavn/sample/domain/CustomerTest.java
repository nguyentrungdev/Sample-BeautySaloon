package com.aavn.sample.domain;

import org.junit.Test;

import junit.framework.Assert;

public class CustomerTest {
	@Test
	public void BeautySalonPaymentTest() {
		Customer customer = new Customer();
		customer.setCustomerType(Customer.PREMIUM);
		Assert.assertEquals(20d, customer.getDiscountForService(100d));
	}
}
