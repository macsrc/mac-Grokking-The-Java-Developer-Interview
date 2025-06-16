package com.tech.Q021;

public class Q021_1_UncheckedExceptionThrown {
	public static void method1() {
		method2();
	}

	private static void method2() {
		throw new ArithmeticException("Arithmetic Exception from method2");

	}

	public static void main(String[] args) {
		method1();
	}
}
