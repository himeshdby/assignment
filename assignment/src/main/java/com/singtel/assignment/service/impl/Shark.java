package com.singtel.assignment.service.impl;

public class Shark implements Fish{

	@Override
	public void size() {
		System.out.println("I am large");
		
	}

	@Override
	public void colour() {
		System.out.println("I am grey in colour");
	}

	@Override
	public boolean eat() {
		System.out.println("I eat other fish");
		return true;
		
	}

	@Override
	public boolean makeJokes() {
		System.out.println("I don't make Jokes");
		return false;
	}

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

}
