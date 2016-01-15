package com.hwtechservicesllc.jcg.designpatterns.factorymethod;

public class ResponseXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new ResponseXMLParser();
	}

}
