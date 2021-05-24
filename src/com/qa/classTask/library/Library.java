package com.qa.classTask.library;

import java.util.List;

public class Library {
	

	List<Items> librarylist;
	List<Person> personlist;

	public Library(List<Items> librarylist, List<Person> personlist) {
		super();
		this.librarylist = librarylist;
		this.personlist = personlist;
	}

	public void additems(Items labitems) {

		librarylist.add(labitems);

	}

	public void delitems(Items labitems) {

		librarylist.remove(labitems);

	}

	public void removeItemsById(int id) {

		librarylist.remove(id);

	}

	public void emptyallItems() {

		librarylist.clear();

	}

	public void registerPerson(Person person) {
		personlist.add(person);
	}

	public void delPerson(Person per) {

		personlist.remove(per);

	}

	public void updatePerson(int i, Person name) {

		personlist.set(i, name);

	}
	
	
	
	@Override
	public String toString() {
		return "Library [librarylist=" + librarylist + ", personlist=" + personlist + "]";
	}

}
