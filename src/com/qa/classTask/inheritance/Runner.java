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
		        System.out.println("This from tostring imp:"+person1);//we out put person1 object directly using toString method int parent class person
		        
	///ihneritance
		        
		        
		     Employee Employee1=new Employee("Ermi",31,"M",50000);
		        
		     Employee Employee2=new Employee("Abe",33,"M",110000); 
		     
		     
		     Employee Employee3=new Employee(90000.0);  
		     Trainee Trainee1=new Trainee("Ermi",31,"M");
		            Trainee1.addSubject("phys");
		            Trainee1.addSubject("bio");
		            Trainee1.addSubject("eng");
		      
		            Employee3.name=person3.name;
		            Employee3.age=person3.age;
		            Employee3.gender=person3.gender;
		           
		         Person person4=new Employee(33.0);
		      
		            System.out.println(Trainee1.getSubjectlearned());
		            System.out.println(Employee2.calculateWeeklySalary());
		            System.out.println("E3 :"+Employee3.toString()+ "\s has salary of \s"+ Employee3.calculateWeeklySalary());
		            
		            System.out.println("person4 :"+person4.name);
		            
			}

		}
