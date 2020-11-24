package com.yedam.array;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		char[] arr2 = Arrays.copyOf(arr1,  arr1.length);//aar의 수만큼 카피하겠다
		
		System.out.println(Arrays.toString(arr2));//문자열 리턴
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 
		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);//arr1의 0번째부터를 arr4 0번째부터 arr1의 수만큼 카피하겠다.
		for(int i=0;i<arr4.length;i++){
			System.out.println("arr4[" + i + "]= " + arr4[i]);
		}

	}

}
