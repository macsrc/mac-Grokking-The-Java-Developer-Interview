package com.tech.Q22;

class Parent6 {
	public void hello6() throws Exception {
		System.out.println("Parent class hello method");
	}
}

class Child6 extends Parent6 {
	public void hello6() {
		System.out.println("Child class hello method");
	}
}

public class Q22_6_parentmethodexception_childmethodnotanyexception {
	public static void main(String[] args) {
		Parent6 p = new Child6();
		try {
			p.hello6();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}
}
