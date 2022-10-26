package com.singtel.assignment.service.impl;

public class Duck extends Bird{
	public boolean fly() {
		System.out.println("I am flying");
		return true;
		}

	  public boolean sing() {

		System.out.println("Quack, quack");
		return true;
	}
	  @Override
		public boolean swim() {
			System.out.println("I can swim");
			return true;
		}
	  @Override
		public boolean walk() {
			
				System.out.println("I am walking");
			return true;
			
		}
}
