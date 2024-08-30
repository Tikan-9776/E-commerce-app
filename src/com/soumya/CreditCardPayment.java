package com.soumya;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for creditcard payment
		return "Payment successful through Credit card";
	}
}
