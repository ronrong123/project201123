package com.yedam.abstracts;

public class DmbPhone extends phone {
	//extends : 부모클래스를 상속받는다는 뜻

	@Override
	public void ring() {
		System.out.println("DMB폰 벨..");
	}
	@Override
	//Override:부모가가진 메소드를 재정의해서 쓰는것
	public void turnOff() {
	}
}
