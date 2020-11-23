package com.yedam;

public class Student {

	// 학교,학번,이름,전공
	// 필드
	private String scname;
	private String scnum;
	private String name;
	private String sclass;
	
	
	//생성자
	public Student() {
		
	}
	public Student(String scname, String scnum) {
		this.scname = scname;
		this.scnum = scnum;
	}
	public Student(String scname, String scnum, String name, String sclass) {
		this.scname = scname;
		this.scnum = scnum;
		this.name = name;
		this.sclass = sclass;
	}
	// 메소드
	
	public void showStudentInfo() {
		System.out.println(scname + ", "+ scnum +", " + name );	
	}
	public String getScname() {
		return scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}

	public String getScnum() {
		return scnum;
	}

	public void setScnum(String scnum) {
		this.scnum = scnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

}
