package com.tech.Q019;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoException_multiple_catch_block {

	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("C:\\temp\\dummy.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Action when File is not found");
		} catch (NullPointerException e) {
			System.out.println("Action for NullPointerException");
		} catch (Exception e) {
			System.out.println("Action for exceptions other than "
					+ "FileNotFoundException/NullPointerException");
		} finally {
			System.out.println("Inside finally block");
		}
		
	}

}
