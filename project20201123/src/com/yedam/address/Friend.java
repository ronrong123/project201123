package com.yedam.address;

public class Friend {
	//필드
	private String name;
	private String phone;
	//생성자
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
		
	}
	//getter, setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void showFriendinfo() {
		System.out.println("이름: " + this.name + ", 연락처: " + this.phone);
	}

}
