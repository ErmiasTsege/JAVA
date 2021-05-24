package com.qa.classTask.library;

public class Journals extends Items {
	
	private int impactfactor;
	
	public Journals(String title, String author, boolean isCheckedIn,int impactfactor) {
		super(title, author, isCheckedIn);
        this.impactfactor=impactfactor;

		
	}

	public int getImpactfactor() {
		return impactfactor;
	}

	
	@Override
	public String toString() {
		return "Journal [Title ="+getTitle() +"\s"+ "Author="+ getAuthor()+"\s"+ "impactfactor="+ getImpactfactor()+"\s" + "isCheckIn ="+ isCheckedIn()+"\s id=" + id + "]";
	}

	@Override
	public void reading() {
		System.out.println("Reading Journal");
		
	}

	@Override
	public void speaking() {
		// TODO Auto-generated method stub
		
	}

	

	
	

}
