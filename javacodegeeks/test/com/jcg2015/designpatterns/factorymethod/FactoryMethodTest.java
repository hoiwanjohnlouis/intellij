package com.jcg2015.designpatterns.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		DisplayService service = new FeedbackXMLDisplayService();
		service.display();
		
		service = new ErrorXMLDisplayService();
		service.display();
		
		service = new OrderXMLDisplayService();
		service.display();
		
		service = new ResponseXMLDisplayService();
		service.display();

	}

}
