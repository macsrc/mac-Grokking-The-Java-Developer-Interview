package com.tech.Q22;

class Parent4 {
	public void hello4() throws Exception {
		System.out.println("Parent class hello method");
	}
}

class Child4 extends Parent4 {
	public void hello4() throws Exception {
		System.out.println("Child class hello method");
	}
}

public class Q22_4_childoverriddenmethodthrowssameexceptionasparent {
	public static void main(String[] args) {
		Parent4 p = new Child4();
		try {
			p.hello4();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}
}