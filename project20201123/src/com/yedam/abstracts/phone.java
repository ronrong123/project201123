package com.yedam.abstracts;

public abstract class phone {
	// abstract:추상클래스라는 선언
	public String owner;

	public phone() {
	}

	public phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}
	public abstract void ring();
	public abstract void turnOff();
	//추상 클래스 안에 추상메소드가 있는 경우 모든 자식 클래스에는 반드시 추상메소드를 구현하는 명령어를 적어야함
	
}
