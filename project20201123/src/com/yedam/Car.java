package com.yedam;

public class Car {
	//field
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	// Constructor
	//public없는건 동일 패키지에서만 가능??	
	//public을 적으면 다른 패키지에서도 import를 해서 사용이 가능함.
	public Car(){
		
	}
	public Car(String company){
		this.company=company;		
	}
	public Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// Method
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
