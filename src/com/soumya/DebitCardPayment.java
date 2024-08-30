package com.soumya;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for debit card payment
		return "Payment successful through DebitaCard";
	}

}
