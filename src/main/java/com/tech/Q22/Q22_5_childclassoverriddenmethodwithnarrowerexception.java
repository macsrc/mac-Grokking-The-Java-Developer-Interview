package com.tech.Q22;

import java.io.IOException;

class Parent5 {
	public void hello5() throws Exception {
		System.out.println("Parent class hello method");
	}
}

class Child5 extends Parent5 {
	public void hello5() throws IOException {
		System.out.println("Child class hello method");
	}
}

public class Q22_5_childclassoverriddenmethodwithnarrowerexception {
	public static void main(String[] args) {
		Parent5 p = new Child5();
		try {
			p.hello5();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}
}