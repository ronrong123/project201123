package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// 1.전체조회, 2.한건조회, 3.입력, 4.수정, 5.삭제

		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.전체조회 | 2.검색 | 3.입력 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();scn.nextLine();
			if (selectNo == 1) {
				List list = service.getEmpList();
				for(Object vo : list) {
					//object는 상위 클래스로 모든 변수를 담을수있음 
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}
			} else if (selectNo == 2) {
				System.out.print("조회할 사원번호 입력: ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();				
			} else if (selectNo == 3) {
				EmployeeVO vo = new EmployeeVO();
				
				System.out.print("employee_id: ");
				int employeeID = scn.nextInt();scn.nextLine();
				System.out.print("last_name: ");
				String lastName = scn.nextLine();
				System.out.print("email: ");
				String email=scn.nextLine();
				System.out.print("job_id: ");
				String jobId=scn.nextLine();
				System.out.print("hire_date: ");
				String hireDate=scn.nextLine();
				
				vo.setEmployeeId(employeeID);
				vo.setLastName(lastName);
				vo.setEmail(email);
				vo.setJobId(jobId);
				vo.setHireDate(hireDate);
				
				service.insertEmp(vo);
				
				
				
			} else if (selectNo == 4) {
				System.out.print("수정할 사원번호: ");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("수정할 이메일: ");
				String email  = scn.nextLine();
				System.out.println("수정할 전화번호: ");
				String phoneNum = scn.nextLine();
				System.out.println("수정할 급여: ");	
				String salary = scn.nextLine();		
				if(salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary);
				
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNum);
				vo.setSalary(sal);				
				
				service.updateEmp(vo);
				
			} else if (selectNo == 5) {
				System.out.print("사원번호입력: ");
				int empId = scn.nextInt();
				service.deleteEmp(empId);
			} else if (selectNo == 6) {
				break;
			}

		}
		System.out.println("✨✨✨✨✨");
		System.out.println("프로그램 종료.");
		System.out.println("✨✨✨✨✨");
	}

}
