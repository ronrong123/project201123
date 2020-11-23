package com.yedam.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/"); //text에 있는 /를 기본 구분자로 만들겠다.
		int countTokens = st.countTokens();
		//꺼내지 않고 남아 있는 토큰의 수 
		System.out.println(countTokens); //3개
		for(int i =0;i<countTokens;i++) {
			String token = st.nextToken();
			//남아있는 토큰을 하나씩 꺼내옴 (3개의 토큰)
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/"); 
		while( st.hasMoreTokens()) {//text에서 /를 뺏을때 남아있는 토큰이 있는지 여부 
			String token = st.nextToken(); //남아있는 토큰이 있다면 그것을 하나씩 꺼내옴
			System.out.println(token);
		}

	}

}
