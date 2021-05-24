package com.qa.classTask.library;

public class Map extends Items {
         
	   private String mapType;
	public Map(String title, String author, boolean isCheckedIn,String mapType) {
		super(title, author, isCheckedIn);
		// TODO Auto-generated constructor stub
		this.mapType=mapType;
	}
	
		
	
	
	
	public String getMapType() {
		return mapType;
	}



	public void setMapType(String mapType) {
		this.mapType = mapType;
	}


	@Override
	public void reading() {
		System.out.println("reading map");
		
	}


@Override
public String toString() {
	return "Map [Title ="+getTitle() +"\s"+ "Author="+ getAuthor()+"\s"+ "mapType="+ getMapType()+"\s" + "isCheckIn ="+ isCheckedIn()+"\s id=" + id + "]";
}





@Override
public void speaking() {
	// TODO Auto-generated method stub
	
}
}