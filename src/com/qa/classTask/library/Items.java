package com.qa.classTask.library;

public abstract class Items implements Readeablity {
	
	
	private String title;
	private  String  author;
	public int id;
	public static int count=1;
	private boolean isCheckedIn;

	public Items(String title, String author,boolean isCheckedIn) {
	
		this.title = title;
		this.author = author;
		this.id=++count;
		this.setCheckedIn(isCheckedIn);
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}




	public boolean isCheckedIn() {
		return isCheckedIn;
	}


	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}
	
	
	
		 
		 @Override
	 
	public String toString() {
		return "Items [title=" + title + ", author=" + author + "]";
	}

	
	
	

}
