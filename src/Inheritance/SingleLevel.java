package Inheritance;

public class SingleLevel {

	public static void main(String[] args)  
	{
		MotherClass m=new MotherClass();
		m.care();
		
		ChildClass c=new ChildClass();
		c.care();
		c.mobile();

	}

}
