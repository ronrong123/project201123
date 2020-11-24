package com.yedam.db;

public class Departments {
	
	private String departmentId;
	private int managerId;
	private String departmentName;
	private int locationId;
	
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	//

	public void showDepInfo() {
		System.out.println("department_id: " + departmentId + ", manager_id: " + managerId
				+", department_name: " + departmentName +
				", location_id: " + locationId);
	}
	
}
