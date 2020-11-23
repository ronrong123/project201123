package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {
	// 주소록 생성 프로그램..
	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);
		//입력한 값을 읽어와서 출력하겠다
		
		while(true) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("1.친구정보 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.종료 | 6.전화번호찾기");				
				System.out.println("-----------------------------------------------------------------");
				System.out.print("선택> ");
				int selectNo = scn.nextInt();scn.nextLine();
				
				if(selectNo == 1) {
					System.out.print("친구이름: ");
					String name = scn.nextLine();
					System.out.print("전화번호: ");
					String phone = scn.nextLine();
					Friend frnd = new Friend(name, phone);			
					for(int i=0;i<friends.length;i++) {
						if(friends[i] == null) {
							friends[i] = frnd;
							break;
						}
					}
				}else if(selectNo == 2) {
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
					for(int i=0;i<friends.length;i++) {
						if(friends[i] == null) {
							friends[i] = frnd;
							break;
						}
					}					
				}else if(selectNo == 3) {
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
					for(int i=0;i<friends.length;i++) {
						if(friends[i] == null) {
							friends[i] = frnd;
							break;
						}
					}
				}else if(selectNo == 4) {
					for(int i=0;i<friends.length;i++) {
						if(friends[i] != null) {
							friends[i].showFriendinfo();
						}
					}
				}else if(selectNo == 5) {
					break;								
				}else if(selectNo == 6) {
					System.out.print("전화번호입력>");
					String phone = scn.nextLine();
					for(int i=0;i<friends.length;i++) {
						if(phone.equals(friends[i].getPhone())) {
							friends[i].showFriendinfo();
							break;
						}
					}
				}			
		}		
		System.out.println("프로그램 종료.");
		
	}// end of main()
} // end of class
