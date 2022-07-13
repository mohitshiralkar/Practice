package Polymerisation;

public class MethodOverloading {

	public static void main(String[] args)
	{ MethodOverloading m=new MethodOverloading();
	m.mul();
	m.mul(60, 4);
		

	}
     public void mul()
     {
    	 int a=10;
    	 int b=5;
    	 int mul=a*b;
    	 System.out.println("Multiplication is "+mul);
     }
     
     public void mul(int a, int b)
     {
    	 int mul=a*b;
    	 System.out.println("mul is "+mul);
     }
}
