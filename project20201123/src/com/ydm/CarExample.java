package com.ydm;

import com.yedam.Car;
//패키지가 달라지면 Car가 있는 패키지 주소를 적어줘야함 ctrl + shift + o(import주소 불러오기)
//불러올 class가 com.yedam.Car라는 주소에 있어서 import로 불러와야 인식이됨
public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();		
		Car c2 = new Car("현대");
		Car c3 = new Car("삼성", "SM5");
	}

}
