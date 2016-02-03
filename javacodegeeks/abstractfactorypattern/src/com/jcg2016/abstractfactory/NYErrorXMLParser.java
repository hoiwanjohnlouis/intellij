package com.jcg2016.abstractfactory;

import java.lang.Override;
import java.lang.String;
import java.lang.System;

public class NYErrorXMLParser implements XMLParser{

	@Override
	public String parse() {
		System.out.println("NY Parsing error XML...");
		return "NY Error XML Message";
	}

}
