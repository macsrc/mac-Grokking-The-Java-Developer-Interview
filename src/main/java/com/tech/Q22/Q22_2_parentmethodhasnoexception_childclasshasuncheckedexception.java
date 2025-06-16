package com.tech.Q22;

class Parent2 {
	public void hello() {
		System.out.println("Parent class hello method");
	}
}

class Child2 extends Parent2 {
	public void hello() throws ArithmeticException{
		System.out.println("Child class hello method");
	}
}

public class Q22_2_parentmethodhasnoexception_childclasshasuncheckedexception {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.hello();
	}
}