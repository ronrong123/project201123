package com.yedam.string;

public class StringTest {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.getGenderInfo("991123-1234567");
		t1.getGenderInfo("991112_2345678");
		t1.getGenderInfo("010101*3123456");
		t1.getGenderInfo("0202024211234");
	}//main

}
