package com.jcg2015.designpatterns.factorymethod;

public class FeedbackXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}

}