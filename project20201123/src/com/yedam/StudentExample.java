package com.yedam;

public class StudentExample {

	public static void main(String[] args) {
		//public, private에따라 다른 패키지에서 출력할수있냐없냐를 결정함

		Student s1 = new Student();
		s1.setName("김유진");
		s1.setSclass("자바");
		s1.setScname("예담");
		s1.setScnum("11-1234");

		Student s2 = new Student("예담전문", "11-1123");
		s2.setName("손미희");
		s2.setSclass("영상디자인");

		Student s3 = new Student("예담", "10-1123", "이승은", "시각디자인");
		Student s4 = new Student("예담", "12-1025", "배가람", "체대");

		Student[] students = { s1, s2, s3, s4};
		for (Student std:students) {
			if ("예담".equals(std.getScname())) {
				std.showStudentInfo();
			}
		}

	}
}
