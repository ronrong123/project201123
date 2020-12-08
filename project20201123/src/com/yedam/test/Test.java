package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/* 정수 3개를 입력받아 오름차순으로 정렬하는 프로그램 
		 * 첫번째:34, 두번째:29, 세번째:67*/
		Scanner scn = new Scanner(System.in);		
		
		while(true) {			
			System.out.print("첫번째 입력: ");
			int no = scn.nextInt();
			System.out.print("두번째 입력: ");
			int no1= scn.nextInt();
			System.out.print("세번째 입력: ");
			int no2 = scn.nextInt();
			int[] num = {no, no1, no2};
			Arrays.sort(num);
			for(int i = 0;i<num.length;i++) {
				System.out.println("num[" + i + "]" + num[i]);				
			}
			System.out.println();
			System.out.println("✨✨✨✨✨✨✨✨");
			System.out.println(" ✨ 시스템종료 ✨ ");
			System.out.println("✨✨✨✨✨✨✨✨");
			break;
		}

	}

}
