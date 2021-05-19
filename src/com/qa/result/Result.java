
package com.qa.result;

public class Result {
	public static double bio=122;
	public static double chem=130;
	public static double phy=55;
	public static double percentage;
	public static int count=0;
	public static double total=bio+chem+phy;
	
	public static void displayResults ()
	
	{
		System.out.println("Physics:"+phy);
		System.out.println("chemistry:"+chem);
		System.out.println("Biology:"+bio);
		
		
	}
	
public static double overAllResult () {
return percentage=total*(100.0/450.0);

}
public static void passFail() {
	if(percentage>60 && phy>60 && chem>60&&bio>60) {
		System.out.println("You Passed!");
	
	}
	else {
	      if(phy<60) {
	    	  count++;
	      }
	      if(chem<60) {
	    	  count++;
	      }
	      if(bio<60) {
	    	  count++;
	      }
	      System.out.println("You failed! "+ "The Number of subject you faild is "+ count);
	}
	}
}
	


