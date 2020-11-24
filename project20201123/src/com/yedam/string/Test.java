package com.yedam.string;

public class Test {
	private String birth;
	
	public Test() {	
	}	

	public void getGenderInfo(String birth) {
	    this.birth = birth;
	    birth.replace("[-\\_\\*]" , "");
	     char sex = birth.charAt(7);
	     switch (sex) {
	     case '1':
	     case '3':
	    	 System.out.println("남자 입니다.");
	    	 break;
	     case '2':
	     case '4':
	    	 System.out.println("여자 입니다.");
	    	 break;
	     }
	}


}
