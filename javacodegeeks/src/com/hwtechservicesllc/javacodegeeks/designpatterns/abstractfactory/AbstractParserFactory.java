package com.hwtechservicesllc.javacodegeeks.designpatterns.abstractfactory;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
