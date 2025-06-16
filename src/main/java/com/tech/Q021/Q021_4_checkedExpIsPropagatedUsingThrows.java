package com.tech.Q021;

import java.io.IOException;

public class Q021_4_checkedExpIsPropagatedUsingThrows {

	public static void method1() throws IOException {		//throws at work
		throw new IOException("IO Exception occurred");
	}
	
	public static void main(String[] args) {
//		method1();											// propagated till here
	}
	
}