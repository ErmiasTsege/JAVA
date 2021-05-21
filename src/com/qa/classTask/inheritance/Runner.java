package com.qa.classTask.inheritance;

import com.qa.classTask.inheritance.Person;
import com.qa.classTask.inheritance.Book;

public class Runner {

	public static void main(String[] args) {
		
		    
				Person person1= new Person("Ermi",30,"M");
				Person person2= new Person("Tigist",38,"F");
				Person person3= new Person("Amet",33,"F");
		        System.out.println(person1.speak("hello"));
		        Book book1=new Book ("Yesmake Worku","Dertogada",true);
		        Book book2=new Book ("Beweketu Seyum","Megbat Ena Mewtate",true);
		        Book book3=new Book ("Beweketu Seyum","Megbat Ena Mewtate",true);
		        book1.bookAvailability();
		        book1.pages=1230;
		        book2.pages=2230;
		        book3.pages=2230;
		        person1.Read(book1);
		        person2.Read(book2);
		        person3.Read(book3);
		        
	///ineritance
		     Employee Employee1=new Employee("Ermi",31,"M",50000);
		        
		     Employee Employee2=new Employee("Abe",33,"M",110000); 
		     Employee Employee3=new Employee("Debe",30,"M",90000);  
		     Trainee Trainee1=new Trainee("Ermi",31,"M");
		            Trainee1.addSubject("phys");
		            Trainee1.addSubject("bio");
		            Trainee1.addSubject("eng");
		            
		            System.out.println(Trainee1.getSubjectlearned());
		            System.out.println(Employee2.calculateWeeklySalary());
			}

		}

