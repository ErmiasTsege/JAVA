package com.qa.classTask;
import com.qa.classTask.Person;
import com.qa.classTask.Book;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
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
	}

}
