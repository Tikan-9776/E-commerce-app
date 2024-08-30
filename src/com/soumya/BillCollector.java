package com.soumya;

public class BillCollector {
	private IPayment payment;

	public void setpayment(IPayment payment) {
		this.payment = payment;
	}

	public void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
