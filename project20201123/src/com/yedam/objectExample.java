package com.yedam;

import java.util.Scanner;

public class objectExample {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner scn;

		Object o1 = new Object();
		boolean sameOrDiff = o1.equals("Hello");
		//equals:o1과 새로만들어진 오브젝트를 비교하겠다
		System.out.println(sameOrDiff);
		
		System.out.println(o1.toString());
		
	}

}
