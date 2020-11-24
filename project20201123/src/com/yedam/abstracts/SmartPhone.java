package com.yedam.abstracts;

public class SmartPhone extends phone {
	//extends : 부모클래스를 상속받는다는 뜻

	@Override
	public void ring() {
		System.out.println("스마트폰 벨..");
	}
	public void turnOff() {
	}
	//부모클래스(추상클래스)에 추상메소드가 추가되면 상속받은 자식 클래스들은 반드시 구현해줘야한다.
}
