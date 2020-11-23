package com.yedam.inheritance;

public class child extends Parent{ //extends : 상속받고싶은 클래스
	String field2;
	
	public child() {
		super();
	}
	
	public child(String field1, String field2) {
		super(field1); // super:부모클래스
		this.field2 = field2;
	}
	
	public void method2() {
		super.method1();
		System.out.println("method2() 호출.");
	}
}
