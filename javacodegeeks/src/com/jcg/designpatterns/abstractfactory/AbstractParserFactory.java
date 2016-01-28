package com.hwtechservicesllc.jcg.designpatterns.abstractfactory;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
