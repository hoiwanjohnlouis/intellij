package com.jcg2016.abstractfactory;

import java.lang.String;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
