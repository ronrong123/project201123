package com.yedam;

public class Calculator {
// public : 다른 필드에서도 출력할수있음

	private String color;
	static double pi = 3.14;
	
	public void setColor(String color) {
		this.color = color;
	}	
	public static int plus(int a, int b) {
		//static이 붙으면 메소드가 인스턴스 소속이아닌 class소속이됨
		return a + b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}

}
