package ConstructorStudy;

public class WithParameter {
	int a;
	int b;
	
	public WithParameter()
	{
	 a=1000;
	 b=500;
	}
	public WithParameter(int x)
	{
		a=x;
	}
	public WithParameter(int x, int y)
	{
		a=x;
		b=y;
	}
	public static void main(String[] args) {
		WithParameter ut=new WithParameter();
		ut.Addition();
		

	}
    public void Addition()
    {
    	int add= a+b;
    	System.out.println("Adddition is "+add);
    }
}
