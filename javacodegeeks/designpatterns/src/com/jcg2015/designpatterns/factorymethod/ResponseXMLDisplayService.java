package com.jcg2015.designpatterns.factorymethod;

public class ResponseXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new ResponseXMLParser();
	}

}
