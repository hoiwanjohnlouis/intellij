package com.jcg2015.designpatterns.adapter;

import com.jcg2015.designpatterns.adapter.payd.PayD;
import com.jcg2015.designpatterns.adapter.site.XpayImpl;
import com.jcg2015.designpatterns.adapter.site.XpayToPayDAdapter;
import com.jcg2015.designpatterns.adapter.xpay.Xpay;

public class AdapterText {

	public static void main(String[] args) {
		
		// Object for Xpay
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Max Warner");
		xpay.setCardExpMonth("09");
		xpay.setCardExpYear("25");
		xpay.setCardCVVNo((short)235);
		xpay.setAmount(2565.23);
		
		PayD payD = new XpayToPayDAdapter(xpay);
		testPayD(payD);
	}
	
	private static void testPayD(PayD payD){
		
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
	}

}
