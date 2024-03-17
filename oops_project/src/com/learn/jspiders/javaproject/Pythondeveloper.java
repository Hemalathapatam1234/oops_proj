package com.learn.jspiders.javaproject;

public class Pythondeveloper extends Backenddeveloper //achieving inheritance using extends keyword
{

	@Override//overridden methods
	public void dobackendproject() {
		System.out.println("Python developer is doing backend project");
	}
	//child specific methods
	public void learnpython() {
		System.out.println("Python developer is learning python");
	}
	
}
