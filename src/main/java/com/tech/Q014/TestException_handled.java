package com.tech.Q014;

public class TestException_handled {
	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			int a = 15 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}
		System.out.println("Program End");
	}
}