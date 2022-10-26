package com.singtel.assignment.service.impl;

public class RoosterDelegation {
	
   Chicken chkn= new Chicken();
  
   public void fly() {
	   chkn.fly();
	  
		}

	  public void sing() {

		  System.out.println("Cock-a-doodle-doo");
	}
	  public void walk(){
		  chkn.walk();
			}
}
