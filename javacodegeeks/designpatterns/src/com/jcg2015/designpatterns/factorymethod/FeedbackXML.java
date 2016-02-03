package com.jcg2015.designpatterns.factorymethod;

public class FeedbackXML implements XMLParser{

	@Override
	public String parse() {
		System.out.println("Parsing feedback XML...");
		return "Feedback XML Message";
	}

}

