package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {
	// class에 바로 선언되는것은 필드라고함
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 위에 선언하면 다른 메소드들도 사용가능
	// 주소록 생성 프로그램..
	public static void main(String[] args) {

		while (true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.친구정보 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.종료 | 6.검색");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();
			} else if (selectNo == 3) {
				addCompFriend();
			} else if (selectNo == 4) {
				showFriendList();
			} else if (selectNo == 5) {
				break;
			} else if (selectNo == 6) {
				searchFriend();
			}
		}
		System.out.println("프로그램 종료.");

	}// end of main()
		// 메소드는 메인 밖에서 만들어야함
		// 1.친구등록

	public static void addFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
		insertFeiend(frnd);
	}

	// 2. 학교친구
	public static void addUnivFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.print("학교이름: ");
		String univ = scn.nextLine();
		System.out.print("전공정보: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFeiend(frnd);
	}

	// 3. 회사친구
	public static void addCompFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.print("회사이름: ");
		String company = scn.nextLine();
		System.out.print("부서정보: ");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);
		insertFeiend(frnd);
	}

//4. 리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendinfo();
			}
		}
	}

//6.한건조회
	public static void searchFriend() {
		System.out.print("검색>");
		String phone = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (phone.equals(friends[i].getPhone())) {
				friends[i].showFriendinfo();
				break;
			}
		}
	}
	//7.한건입력
	public static void insertFeiend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
} // end of class









