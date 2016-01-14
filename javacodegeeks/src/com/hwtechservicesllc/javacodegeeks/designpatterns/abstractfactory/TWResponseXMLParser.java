package com.hwtechservicesllc.javacodegeeks.designpatterns.abstractfactory;

public class TWResponseXMLParser implements XMLParser{

	@Override
	public String parse() {
		System.out.println("TW Parsing response XML...");
		return "TW Response XML Message";
	}

}
