package variable_types;

public class GlobalVariable {
	int a=50; //global non static variable
	static int b=60; //global static variable

	public static void main(String[] args) {
		
		//int sum=a+10;
		test1();
		GlobalVariable rt=new GlobalVariable();
		rt.test();
	}
   public void test()
   {
	   int sum=a+10;
	   int sub=b-10;
	   System.out.println("Addition is "+sum);
	   System.out.println("Substraction is "+sub);
   }
   public static void test1()
   {
	   //int sum=a+10;
	   int sub=b-10;
	   System.out.println("Substraction is "+sub);
   }
}
