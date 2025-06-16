package com.tech.Q021;

public class Q021_2_UncheckedExceptionHandled {
	public static void method1() {
		method2();
	}

	private static void method2() {
		throw new ArithmeticException("Arithmetic Exception from method2");
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}
	}
}
