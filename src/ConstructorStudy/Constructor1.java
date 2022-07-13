package ConstructorStudy;

public class Constructor1 {
	int a;
	int b;
	int c;
	
	public Constructor1()
	{
	 a=50;
	 b=30;
	 c=60;
	 int sum=a+b+c;
	 System.out.println("Addition is "+sum);
	}

	public static void main(String[] args) {
	Constructor1 g=new Constructor1();
	g.Mathoeration();

	}
    public void Mathoeration()
    { int sum=a+b+c;
    
     System.out.println("Sum is "+sum); 	
    }
}
