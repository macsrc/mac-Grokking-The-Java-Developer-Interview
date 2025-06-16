package com.tech.Q22;

class Parent3 {
	public void hello3() throws ArithmeticException {
		System.out.println("Parent class hello method");
	}
}

class Child3 extends Parent3 {
//	public void hello3() throws Exception {				//throws exception
//		System.out.println("Child class hello method");
//	}
}

public class Q22_3_Childclassoverriddenmethodthrowsbroaderexception {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		p.hello3();
	}
}