package com.qa.classTask;
import com.qa.classTask.Person;
import com.qa.classTask.Book;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Person person1= new Person("Ermi",30,"M");
        System.out.println(person1.speak("hello"));
        Book book1=new Book ("Yesmake Worku","Dertogada",true);
        book1.bookAvailability();
	}

}
