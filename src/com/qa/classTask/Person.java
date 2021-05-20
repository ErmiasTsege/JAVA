package com.qa.classTask;

public class Person {
	public String name; //
	public int age; //
	public String gender; //
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet
// Constructor is used to 

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void read() {
		System.out.println(this.name + " is reading the book titled: {given}");
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}

	public void Read(Book item) {
		System.out.println(this.name + "\sreads" + "\sthe book in title\s" + item.BookTitle + "\sby\s" + item.AuthorName
				+ "\swhich contains\s" + item.pages + "\spages.");
	}

}
