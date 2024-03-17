package com.learn.jspiders.javaproject;

public class Backenddeveloper extends SoftwareEngineer //achieving inheritance using extends keyword
{
	@Override//overridden methods
	public void attendmeeting() {
		System.out.println("Backend developer is attending the meeting");
	}

	@Override//overridden methods
	public void testcode() {
		System.out.println("Backend developer is testing the code");
		
	}
	//child specific methods
	public void dobackendproject() {
		System.out.println("Backend developer is doing backend project" );
	}
	

}
