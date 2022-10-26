package com.singtel.assignment.service.impl;

public class Clownfish implements Fish{

	@Override
	public boolean fly() {
		
			System.out.println("I cannot fly");
			return false;
			
		
		
	}

	@Override
	public boolean sing() {
		System.out.println("I cannot sing");
		return false;
		
	}

	@Override
	public boolean walk() {
		System.out.println("I cannot walk");
		return false;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I can swim");
		return true;
		
	}

	@Override
	public void size() {
		System.out.println("I am small");
		
	}

	@Override
	public void colour() {
		System.out.println("I am Orange in colour");
	}

	@Override
	public boolean eat() {
		System.out.println("I dont eat other fish");
		return false;
		
	}

	@Override
	public boolean makeJokes() {
		System.out.println("I make Jokes");
		return true;
		
	}

}
