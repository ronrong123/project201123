package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DpmDAO {
	Connection conn = getConnection();

	public Departments[] getDpmList() {
		String sql = "select * from departments";
		Departments[] dpms = new Departments[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int i = 0;
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Departments dpm = new Departments();
				dpm.setDepartmentId(rs.getString("department_id"));
				dpm.setManagerId(rs.getInt("manager_id"));
				dpm.setLocationId(rs.getInt("location_id"));
				dpm.setDepartmentName(rs.getString("department_name"));
				dpms[i++] = dpm;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dpms;
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
