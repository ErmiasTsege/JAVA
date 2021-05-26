package com.qa.classTask.library;

public class Book extends Items{
	
	private int pagenumber;

   
	public Book(String title, String author, boolean isCheckedIn,int pagenumber) {
		super(title, author, isCheckedIn);
		 this.pagenumber=pagenumber;
	}

	public int getPagenumber() {
		return pagenumber;
	}

	public void setPagenumber(int pagenumber) {
		this.pagenumber = pagenumber;
	}

	@Override
	public String toString() {
		return "Book [Title ="+getTitle() +"\s"+ "Author="+ getAuthor()+"\s"+ "pagenumber="+ getPagenumber()+"\s" + "isCheckIn ="+ isCheckedIn()+"\s id=" + id + "]";
	}

	@Override
	public void reading() {
		System.out.println("Reading book");
	}

	@Override
	public void speaking() {
		// TODO Auto-generated method stub
		
	}



}
