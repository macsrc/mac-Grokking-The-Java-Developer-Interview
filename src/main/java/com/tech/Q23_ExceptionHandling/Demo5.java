package com.tech.Q23_ExceptionHandling;

public class Demo5 {

	public static int method1() {
		try {
			int a = 15/0;  //play with a = 15/5
			return 1;
		} catch(Exception e) {
			return 2;
		}
	}
	
	public static void main(String[] args) {
		int result = method1();
		System.out.println(result);
	}

}