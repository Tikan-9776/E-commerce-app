package com.soumya;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for Upi Payment
		return "Payment successful through UPI";
	}

}
