package com.aavn.sample.domain;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.aavn.sample.services.impl.PaymentService;
import com.aavn.sample.services.interfaces.IBonusPointAccumulable;
import com.aavn.sample.services.interfaces.IPaymentService;

public class CustomerTest {
	private static final double TOTAL_AMOUNT = 100d;
	private IPaymentService paymentService = new PaymentService();
	@Test
	public void BeautySalonPaymentTest() {
		Customer firstPremiumCustomer = new Customer();
		firstPremiumCustomer.setCustomerType(Customer.PREMIUM);
		Assert.assertEquals(20d, firstPremiumCustomer.getDiscountForService(100d));
		
		//2nd Solution
		Customer premiumCustomer = new PremiumCustomer();
		Customer goldCustomer = new GoldCustomer();
		Customer silverCustomer = new SilverCustomer();
		Customer normalCustomer = new NormalCustomer();
		
		List<Customer> customers = new ArrayList<>();
		customers.add(premiumCustomer);
		customers.add(goldCustomer);
		customers.add(silverCustomer);
		customers.add(normalCustomer);
		
		for(Customer customer : customers) {
			paymentService.makePaymentFor(customer, TOTAL_AMOUNT);
			if (hasBonusPointAccumulable(customer)) {
				IBonusPointAccumulable bonusPointAccumulableCustomer = (IBonusPointAccumulable) customer;
				bonusPointAccumulableCustomer.getBonusPointBasedOnTotalAmount(TOTAL_AMOUNT);
			}
		}
	}
	
	private boolean hasBonusPointAccumulable(Customer customer) {
		return customer instanceof IBonusPointAccumulable;
	}
}
