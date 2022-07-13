package ConstructorStudy;

public class UserdefinedConstructor {
	String A,B;
	int C,D;
	float E;
	public UserdefinedConstructor(String StudentName, String House_no, int RollNum, int TotalMarks, float Percentage )
	{
	 A=StudentName;
	 B=House_no;
	 C=RollNum;
	 D=TotalMarks;
	 E=Percentage;
	 
	}

	public static void main(String[] args) {
		UserdefinedConstructor studentinformation=new UserdefinedConstructor("Mohit", "s12", 78, 960, 94.10f);
		studentinformation.collegedata();

	}
    public void collegedata()
    {
      System.out.println("Student name is "+A);	
      System.out.println("House no is "+B);
      System.out.println("Roll no is "+C);
      System.out.println("Total Marks is "+D);
      System.out.println("Percentage is "+E);
    }
}
