package com.tech.Q021;

import java.io.IOException;

public class Q021_5_checkedExceptionIsHandled {

	public static void method1() throws IOException {
		throw new IOException("IO Exception occurred");
	}

	public static void main(String[] args) {

		try {
			method1();
		} catch (IOException e) {
			System.out.println("Exception handled");
		}

	}

}