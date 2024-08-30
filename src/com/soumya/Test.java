package com.soumya;

public class Test {
	public static void main(String[] args) {
		BillCollector bc = new BillCollector();
          //injecting Creditcard obj into BillCollector(Setter Injection)
		bc.setpayment(new CreditCardPayment());
		bc.collectPayment(1500.00);
	}
}
