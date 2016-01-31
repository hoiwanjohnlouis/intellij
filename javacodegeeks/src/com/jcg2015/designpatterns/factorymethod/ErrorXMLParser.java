package com.jcg2015.designpatterns.factorymethod;

public class ErrorXMLParser implements XMLParser{

	@Override
	public String parse() {
		System.out.println("Parsing error XML...");
		return "Error XML Message";
	}

}
