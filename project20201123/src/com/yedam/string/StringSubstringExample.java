package com.yedam.string;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567 ";

		String firstNum = ssn.substring(0, 6); // 0~6까지의 수를 잘라낸 문자열 리턴
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7위치에서 endindex를 잘라낸 문자열
		System.out.println(secondNum);
	}

}
