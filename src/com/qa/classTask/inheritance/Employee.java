package com.qa.classTask.inheritance;

import com.qa.classTask.inheritance.Person;

public class Employee extends Person {

	private double annualSalary;
	private double weeklySalary;

	public Employee() {
		super();
		this.annualSalary = 55;
	}

	public Employee(String name, int age, String gender, double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
	}

	public Employee(double annualSalary) {
		this();
		this.annualSalary = annualSalary;
	}

	public double calculateWeeklySalary() {
		return weeklySalary = annualSalary / 52.0;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

}
