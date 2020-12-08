package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

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
			
			for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					if(num[i]>num[j]) {//i가 j보다 클떄
						int temp = num[j]; //temp가 j번쨰 값이됨
						num[j] = num[i]; //두번째값(j)에 첫번째값(i)이옴
						num[i] = temp; //첫번째는 아까 temp에 담아둿던 j값이옴
						
					}else {
						break;
					}
				}
			}	
			for(int sort:num) {
				System.out.println(sort);
			}
			
			System.out.println();
			System.out.println("✨✨✨✨✨✨✨✨");
			System.out.println(" ✨ 시스템종료 ✨ ");
			System.out.println("✨✨✨✨✨✨✨✨");
			break;
		}

	}

}
