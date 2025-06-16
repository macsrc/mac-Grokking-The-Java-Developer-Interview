package com.tech.Q017;

public class DemoException_multi_exceptions {

	public static void main(String[] args) {
		
//		A try block is always followed by a catch block or finally or both.
		try {
//				FileReader f = new FileReader("C:\\temp\\dummy.txt"); //checked exception
		} finally {
			System.out.println("Inside finally block");
		}

	}

}
