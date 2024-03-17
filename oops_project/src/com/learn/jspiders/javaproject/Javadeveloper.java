package com.learn.jspiders.javaproject;

public class Javadeveloper extends Backenddeveloper //achieving inheritance using extends keyword
{
	@Override//overridden methods
	public void dobackendproject() {
		System.out.println("Java developer is doing backend project");
	}
	//child specific methods
	public void learnjava() {
		System.out.println("Java developer is learning java");
	}
	

}
