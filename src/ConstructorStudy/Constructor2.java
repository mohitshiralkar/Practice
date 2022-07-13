package ConstructorStudy;

public class Constructor2 {
	String StudentName;
	int RollNum;
	float Percentage;
	
	public Constructor2()
	{StudentName= "Mohit";
	RollNum= 76;
	Percentage= 88.33f;
	
	System.out.println("Student name is "+StudentName);
	System.out.println("Student Roll no is "+RollNum);
	System.out.println("Student Percentage is "+Percentage);
		
	}
	
	public static void main(String[] args) {
		Constructor2 rt=new Constructor2();
		

	}

}
