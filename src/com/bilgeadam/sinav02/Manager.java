package com.bilgeadam.sinav02;

public class Manager extends Employee{
	private String departmant;
	public Manager(int employeeId, String jobTitle, String name, LevelType level, String departmant) {
		super(employeeId, jobTitle, name, level);
		this.departmant = departmant;
	}
	public String getDepartmant() {
		return departmant;
	}
	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}
	
	public void printInformation() {
		System.out.println("Departmant : " + this.departmant);
		super.printInformation();
	}
}
