package com.bilgeadam.sinav02;

public class Employee {
	private int employeeId;
	private String jobTitle, name;
	private LevelType level;
	private static int calculatedId;
	
	public Employee(int employeeId, String jobTitle, String name, LevelType level) {
		calculatedId++;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.name = name;
		this.level = level;
		System.out.println(calculatedId +" Manager is created");
	}
	
	public void printInformation() {
		System.out.println("Emplotee ID : "+ this.employeeId+", Job title :" + this.jobTitle + ", Name : "+ this.name + ", Level : "+ this.level);
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LevelType getLevel() {
		return level;
	}

	public void setLevel(LevelType level) {
		this.level = level;
	}

	public static int getCalculatedId() {
		return calculatedId;
	}

	public static void setCalculatedId(int calculatedId) {
		Employee.calculatedId = calculatedId;
	}
	
	
	
}
