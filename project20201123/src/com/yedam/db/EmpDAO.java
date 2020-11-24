package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = getConnection();
	//Connection : 데이터베이스를 연결하는 객체	
	
	public void insertEmployee(Employee emp) {
		String sql = "insert into emp1(last_name, email, job_id, hire_date) "
						+ "values(?, ?, ?, ?)";		
		//물음표 자리는 추후 set~~를 사용해 값을 집어넣음 
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			//PreparedStatement: 객체를 캐쉬에 담아 재사용
			psmt.setString(1, emp.getLastName());//앞에 넣은 숫자는 물음표의 순번
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());
			int r = psmt.executeUpdate();
			//executeUpdate(): INSERT나 update같은 ddl이나 dml을 실행할때 사용
			System.out.println(r+"건이 입력됨.");
		} catch (SQLException e) {			
			e.printStackTrace();
			// printStackTrace : 에러 메세지의 발생 근원지를 찾아 단계별로 에러를 출력함
		}
	}

	public Employee[] getEmpList() {
		String sql = "select * from emp1";
		Employee[] emps = new Employee[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int i = 0;
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emps[i++] = emp;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emps;
	}
	

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");
			// try ~ catch : 예외처리
		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}

}
