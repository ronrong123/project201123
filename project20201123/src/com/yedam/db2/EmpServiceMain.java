package com.yedam.db2;

import java.util.List;
import java.util.ArrayList;

public class EmpServiceMain {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add ("Hello");//추가
		list.add ("World");
		list.add ("Nice");
		
		for(Object str : list) {
			System.out.println(str);
		}
		list.remove(0);//0번쨰 위치를 지운다.
		list.get(0);//가지고오는것

	}

}
