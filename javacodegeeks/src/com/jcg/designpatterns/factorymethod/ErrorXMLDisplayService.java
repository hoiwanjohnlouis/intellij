package com.hwtechservicesllc.jcg.designpatterns.factorymethod;

public class ErrorXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
