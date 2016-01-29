package com.jcg2015.designpatterns.abstractfactory;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
