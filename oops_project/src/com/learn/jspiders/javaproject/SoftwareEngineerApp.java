package com.learn.jspiders.javaproject;

public class SoftwareEngineerApp 
{
	public static void main(String[] args) 
	{
		//creating objects of the classes
		Backenddeveloper bd=new Backenddeveloper();//Tight coupling
		Frontenddeveloper fd=new Frontenddeveloper();//Tight coupling
		
		//creating objects of the classes
		Backenddeveloper jd=new Javadeveloper();//upcasting-assigning child class object to parent class reference
		Backenddeveloper pd=new Pythondeveloper();//upcasting/LooseCoupling
		
		//calling the methods of the classes by passing the reference
		//polymorphism-1:many relationships
		doactivity(bd);
		
		System.out.println("-----------------------------------------------");
		
		doactivity(fd);
		
		System.out.println("------------------------------------------------");
		
		doactivity(jd);
		
		System.out.println("-------------------------------------------------");
		
		doactivity(pd);
		
		System.out.println("--------------------------------------------------");
	}
	public static void doactivity(SoftwareEngineer se) {
		se.attendmeeting();
		se.testcode();
		
		//calling child specific methods/specialized methods of back end developer class
		if(se instanceof Backenddeveloper) 
		{
			((Backenddeveloper) se).dobackendproject();//downcasting-giving the object reference
														//from parent back to the child
			
		}
		
		//calling child specific methods/specialized methods of front end developer class
		else if(se instanceof Frontenddeveloper) 
		{
			((Frontenddeveloper) se).dofrontendproject();//down casting
			((Frontenddeveloper) se).learnfrontendlanguage();//down casting
			
		}
		
		//calling overridden and child-specific methods of java developer class
		else if(se instanceof Javadeveloper)
		{
			((Javadeveloper) se).dobackendproject();//down casting
			((Javadeveloper) se).learnjava();//down casting
			
		}
		
		//calling overridden and child-specific methods of python developer class
		else if(se instanceof Pythondeveloper) 
		{
			((Pythondeveloper) se).dobackendproject();//down casting
			((Pythondeveloper) se).learnpython();
		}
		
		
	}

}
