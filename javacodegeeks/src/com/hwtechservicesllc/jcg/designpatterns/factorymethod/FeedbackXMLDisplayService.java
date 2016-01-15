package com.hwtechservicesllc.jcg.designpatterns.factorymethod;

public class FeedbackXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}

}