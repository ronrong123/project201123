package com.yedam.CalendarExample;

import java.util.Calendar;

public class CalendarExampleTest {
	public static void showCal(int year, int month) {
		System.out.println(year + "년 " + month + "월");
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		System.out.println("============================");
		for (int i = 0; i < days.length; i++) {			
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		System.out.println("============================");
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);// 입력받은 월의1로 세팅, month는 0이 1월이므로 -1을 해준다.

		int lDate = cal.getActualMaximum(Calendar.DATE);
		// 월의 말일을 리턴
		int fDay = cal.get(Calendar.DAY_OF_WEEK); // 해당날짜의요일

		for (int i = 1; i <= lDate; i++) { // i가 월의 말일수보다 같거나 작을떄
			if (i == 1) {// i가 1일때
				for (int j = 1; j < fDay; j++) {
					System.out.printf("%4s", "");
				} // 위에서 -1을 해서 1부터 시작해야 일요일부터 시작됨
			}
			System.out.printf("%4s", i);
			if (fDay % 7 == 0) {
				System.out.println();
			}
			fDay++;
		}

	}

	public static void main(String[] args) {
		showCal(2020, 2);
	}

}
