package com.yedam.string;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-"); //split안에 넣은 기호들을 구분자로 해서 부분 문자열을 추출
		
		for(String name:names) {
			System.out.println(name);
		}

	}

}
