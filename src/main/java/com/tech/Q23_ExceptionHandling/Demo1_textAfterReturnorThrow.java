package com.tech.Q23_ExceptionHandling;

public class Demo1_textAfterReturnorThrow {
	
	public static int method1() {
		try {
			throw new ArithmeticException();
//			return 1;				// unreachable code
		} catch(Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		int result = method1();
		System.out.println(result);
	}
	
}