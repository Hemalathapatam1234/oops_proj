package com.learn.jspiders.javaproject;

public class Frontenddeveloper extends SoftwareEngineer //achieving inheritance using extends keyword
{

	@Override//overridden methods
	public void attendmeeting() {
		System.out.println("Frontend developer is attending the meeting");
	}

	@Override//overridden methods
	public void testcode() {
		System.out.println("Frontend developer is testing the code");
		}
	//child specific methods
	public void dofrontendproject() {
		System.out.println("Front developer is doing the frontend project");
	}
	//child specific methods
	public void learnfrontendlanguage() {
		System.out.println("Learning frontend language");
	}

}