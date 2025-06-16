package com.tech.Q019;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoException_mostSpecificException {
	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("C:\\temp\\dummy.txt");
		} catch (Exception e) {
			e.printStackTrace();
//		} catch (FileNotFoundException e) {		// exception caught
//			e.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}

	}
}
