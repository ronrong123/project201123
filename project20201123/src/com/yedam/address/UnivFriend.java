package com.yedam.address;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone) {
		super(name, phone);		
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override //부모클래스가 가지고있는 메소드를 수정
	public void showFriendinfo() {
//		super.showFriendinfo();
		System.out.println("이름: " + super.getName() + ", 연락처: " + super.getPhone() + ", 학교: " + this.univ + ", 전공: " + this.major);
	}
	
	

}
