package com.qa.classTask.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Trainee extends Person {
	
	//private double bursary;

	private List <String>subjectlearned=new ArrayList<String>();
	


	public Trainee(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public List<String> getSubjectlearned() {
		return subjectlearned;
	}

	public void setSubjectlearned(List<String> subjectlearned) {
		this.subjectlearned = subjectlearned;
	}

	public void addSubject(String subject) {
		subjectlearned.add(subject);
		
	}
	}


