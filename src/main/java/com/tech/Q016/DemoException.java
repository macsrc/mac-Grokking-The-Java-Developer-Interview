package com.tech.Q016;

import java.io.FileReader;

public class DemoException {

	public static void main(String[] args) {
		
		
		try {
//			FileReader f = new FileReader("C:\\temp\\dummy.txt"); //checked exception
		} finally {
			System.out.println("Inside finally block");
		}
		
	}

}