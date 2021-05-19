package com.qa.result;

public class Runner {
	
	
	
	public static void main(String[] args) {
		// Display students mark and overall percentage
	     Result.displayResults();
	  System.out.println("Overall Percentage:" + Result.overAllResult());
		//Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
	//Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
		
	  //Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed
	  Result.passFail();
		
	}

}

