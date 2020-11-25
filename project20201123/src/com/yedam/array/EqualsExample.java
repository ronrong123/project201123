package com.yedam.array;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}};
		
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		
		System.out.println("깊은 복제후 비교");
		int[][] cloned2 = Arrays.copyOf(original, original.length);//이렇게 복사하면 orginal을 복사해 이름만 바꿔놓은느낌(주소값이같음)
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);//이런식으로 복사하면 cloned2라는 주소에 orginal의 값을 가져옴(주소값이 다름)
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(cloned2) );
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첨 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));

	}

}
