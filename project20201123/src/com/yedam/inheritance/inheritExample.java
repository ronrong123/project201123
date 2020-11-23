package com.yedam.inheritance;

public class inheritExample {

	public static void main(String[] args) {
		Parent p1 = new Parent("필드값1");
		System.out.println(p1.field1);
		p1.method1();

		child c1 = new child("자식필드1", "자식필드2");
		System.out.println(c1.field2);
		System.out.println(c1.field1);
		c1.method1();
		c1.method2();

		NewChild nc1 = new NewChild("또다른자식1", "또다른자식2", "또다른자식3");
		System.out.println(nc1.field1);
		System.out.println(nc1.field3);
		nc1.method1();
		nc1.method3();

		GrandChild gc1 = new GrandChild();
		System.out.println(gc1.field1);
		System.out.println(gc1.field2);
		gc1.method1();
		gc1.method2();

		Parent p = new Parent();
		p = new child();
		p = new GrandChild();

//		child c = new Parent();
//		long > int > short > byte;
		// 부모 클래스는 자식클래스의 인스턴스도 담을수있고 자식의 또다른 자식 클래스의 인스턴스도 가능함.

	}

}
