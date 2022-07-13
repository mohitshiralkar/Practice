package control_statement;

public class ElseIfPractice {

	public static void main(String[] args) {
		//if marks>=80 -your grade is A
		//elseif marks>=60 & <80---your grade is B
		//elseif marks>=45 & <60---your grade is C
		//elseif marks>=30 & <45---your grade is D
		//else---you are fail
		
		int marks=61;
		if(marks>=80 )
		{System.out.println("Your grade is A");
		}
		
		else if (marks>=60 & marks<80)
		{
			System.out.println("Your grade is B");
		}
		else if (marks>=45 & marks<60) 
		{
			System.out.println("Your grade is C");
		}
		else if (marks>=30 & marks<45) 
		{
			System.out.println("Your grade is D");
		}

	else {
		System.out.println("You are fail");
	}
		
	}
	
}
