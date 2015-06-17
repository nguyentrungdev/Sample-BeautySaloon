package com.aavn.sample.domain;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class CustomerTest {
	@Test
	public void BeautySalonPaymentTest() {
		Customer firstPremiumCustomer = new Customer();
		firstPremiumCustomer.setCustomerType(Customer.PREMIUM);
		Assert.assertEquals(20d, firstPremiumCustomer.getDiscountForService(100d));
		
		//2nd Solution
		Customer premiumCustomer = new PremiumCustomer();
		Customer goldCustomer = new GoldCustomer();
		Customer silverCustomer = new SilverCustomer();
		
		List<Customer> customers = new ArrayList<>();
		customers.add(premiumCustomer);
		customers.add(goldCustomer);
		customers.add(silverCustomer);
		
		for(Customer customer : customers) {
			
		}
	}
}
