package com.tech.Q021;

public class Q021_6_throwsNotNeededWithUncheckedException {

	public static void method1() throws ArithmeticException{
		int a = 10 / 0;
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}
	}

}
