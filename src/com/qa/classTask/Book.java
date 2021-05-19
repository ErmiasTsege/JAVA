package com.qa.classTask;

public class Book  {
	public String BookTitle;
	public int pages;
	public String AuthorName;
	public Boolean isCheckedout=false;
	
	public Book(String AuthorName,String BookTitle,Boolean isChecedout) {
		
		 this.AuthorName=AuthorName;
		 this.BookTitle=BookTitle;
		 this.isCheckedout=isChecedout;
		 
	}
	
	public void bookAvailability() {
		if(this.isCheckedout==false) {
			System.out.println("The \s" + this.BookTitle + "\sbook" + " \s by" + this.AuthorName +" \s is available to read ");}
			else 
				{System.out.println("The \s" + this.BookTitle + "\s book\s" + "  by \s" + this.AuthorName +" \s is not available to read");}
		}
		
	
	
	}


