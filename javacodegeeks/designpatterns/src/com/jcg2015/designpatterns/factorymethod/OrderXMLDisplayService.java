package com.jcg2015.designpatterns.factorymethod;

public class OrderXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new OrderXMLParser();
	}

}
