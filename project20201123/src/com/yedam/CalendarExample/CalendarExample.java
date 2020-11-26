package com.yedam.CalendarExample;

import java.util.Calendar;

public class CalendarExample {
	public static void showCal(int year, int month) {
		System.out.println("[ " + year + "년 " + month + "월 ]");
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		System.out.println("=============================");

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		System.out.println("=============================");
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		int lDate = cal.getActualMaximum(Calendar.DATE);// 월의 말일
		int fDay = cal.get(Calendar.DAY_OF_WEEK);// 해당날짜의요일

		for (int i = 1; i < fDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= lDate; i++) {
			System.out.printf("%4s", i);
			if (fDay % 7 == 0) {
				System.out.println();
			}
			fDay++;
		}
	}

	public static void main(String[] args) {

		// 달력클래스
		/*
		 * Calendar cal = Calendar.getInstance();
		 * 
		 * cal.set(2020, 1, 1);// 1월1일: 0/1 System.out.println("년도: " +
		 * cal.get(Calendar.YEAR)); System.out.println("월: " +
		 * cal.get(Calendar.MONDAY));//1월은 0으로 표현됨 System.out.println("날짜: " +
		 * cal.get(Calendar.DATE)); System.out.println("요일: " +
		 * cal.get(Calendar.DAY_OF_WEEK)); //일요일:1, 월요일:2 . . .
		 * System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));
		 */

		/*
		 * for (int i = 1; i <= 30; i++) { System.out.printf("%4d", i); //pritf : 포멧?
		 * "%3d"왼쪽에 여백을 주고싶을떄 사용 3는 내가 여백을 주고싶은만큼 적으면됨 if (i % 7 == 0) {
		 * System.out.println(); } }
		 */

		showCal(2020, 12); // 2020년 5월달 달력보고싶음

	}
}
