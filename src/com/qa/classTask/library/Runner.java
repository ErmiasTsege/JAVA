package com.qa.classTask.library;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book book1=new Book("physics for beiginers","Ermi",false,100);
		Map map1=new Map("worldmap","Ermias",false,"oldmap"); 
		Journals journal1=new Journals("science journal","Ermias",false,5); 
		Person person1=new Person("Ermias",true);
		
	//	System.out.println(book1);
		List <Items> instanceoflibrary=new ArrayList<>();
		List <Person> instanceofperson=new ArrayList<>();
		Library l=new Library(instanceoflibrary,instanceofperson);
		l.additems(book1);
		l.additems(map1);
		l.additems(journal1);
		l.registerPerson(person1);
		//l.delPerson(person1);
		person1.setName("DEBE");
		journal1.reading();
		//l.updatePerson(1, person1);
	//	l.delitems(book2);
		//l.emptyallItems();
		//l.removeItemsById(3);
		System.out.println(l);		
		
		
		
		
		
		

	}

}
