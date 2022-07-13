package MethodsStudy;

public class Math_parameter {

	public static void main(String[] args)
	{
	Math_parameter m1=new Math_parameter();
	m1.Mathoperation(100,10);
	m1.Mathoperation(50,25);
    
	Mathoperation1(200,100);
	} 
   public void Mathoperation(int c, int d)
   {
	  System.out.println("*************************"); 
	  System.out.println("Addition is       "+(c+d));
	  System.out.println("Substraction is   "+(c-d));
	  System.out.println("Multiplication is "+(c*d));
	  System.out.println("Division is       "+(c/d));
	  System.out.println("*************************");
   }
   
   public static void Mathoperation1(int a,int b)
   {
	   
	   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
	   System.out.println("Addition is       "+(a+b));
	   System.out.println("Substraction is   "+(a-b));
	   System.out.println("Multiplication is "+(a*b));
	   System.out.println("Division is       "+(a/b));
	   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
   }
}
