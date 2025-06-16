package com.tech.Q021;

import java.io.IOException;

public class Q021_3_checkedExpNotPropagateByDefault {

	public static void method1() {
//		throw new IOException("IO Exception occurred");    //Error
	}

	public static void main(String[] args) {
		method1();
	}

}