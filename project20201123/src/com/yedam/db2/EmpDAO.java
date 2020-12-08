package com.yedam.db2;

import java.sql.Connection;//데이터베이스연결객체
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {// 데이터베이스 연결
		conn = DAO.getConnection();
		//DAO에 연결되어있는 데이터베이스를 conn이라고 부르겠음
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();

		try {
			pstmt = conn.prepareStatement(sql);
			// prepareStatement:텍스트 sql호출
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setLastName(rs.getString("last_name"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setEmail(rs.getString("email"));
				vo.setJobId(rs.getString("job_id"));
				vo.setHireDate(rs.getString("hire_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<EmployeeVO> getDeptList(String dept) {
		conn = DAO.getConnection();
		sql = "SELECT * FROM emp1\r\n"
				+ "WHERE department_id = \r\n"
				+ "(SELECT department_id FROM departments WHERE department_name = ?)";
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setLastName(rs.getString("last_name"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setEmail(rs.getString("email"));
				vo.setJobId(rs.getString("job_id"));
				vo.setHireDate(rs.getString("hire_date"));
				list.add(vo);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}


	// 한건조회
	public EmployeeVO getEmp(int empId) {// empId로 조회함
		sql = "select * from emp1 where employee_id =?";
		conn = DAO.getConnection();
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	// 한건입력
	public void inserEmp(EmployeeVO vo) {
		sql = "insert into emp1(employee_id,last_name, email, job_id, hire_date)" + "values(?, ?, ?, ?, ?)";
		conn = DAO.getConnection();
		// getConnection는 자바프로그램과 데이터베이스를 연결해주는 메소드
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getLastName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getJobId());
			pstmt.setString(5, vo.getHireDate());

			int r = pstmt.executeUpdate();

			if (r == 1) {
				System.out.println("업데이트되었습니다.");
			} else {
				System.out.println("실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		if (vo.getSalary() != 0) {
			sql = "update emp1"//
					+ " set email = nvl('" + vo.getEmail() + "', email)" + ", phone_number =nvl('" + vo.getPhoneNumber()
					+ "', phone_number)" + ", salary = nvl(" + vo.getSalary() + ", salary)" + " where employee_id = "
					+ vo.getEmployeeId();
		} else {
			sql = "update emp1"//
					+ " set email = nvl('" + vo.getEmail() + "', email)" + ", phone_number =nvl('" + vo.getPhoneNumber()
					+ "', phone_number)" + " where employee_id = " + vo.getEmployeeId();
		}
		conn = DAO.getConnection();
		System.out.println(sql);
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {//예외 여부와 상관없이 실행
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 한건삭제
	public void deleteEmp(int empId) {
		sql = "delete from emp1 where employee_id =?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			System.out.println("삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
