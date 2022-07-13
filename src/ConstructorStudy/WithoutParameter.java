package ConstructorStudy;

public class WithoutParameter {
	 int a;
	 int b;
	 
	 public WithoutParameter()
	 {
		a=800;
		b=500;
	 }
	 

	public static void main(String[] args) {
		WithoutParameter q=new WithoutParameter();
		q.Addition();
		WithoutParameter w=new WithoutParameter();
		w.Multiplication();

	}
    public void Addition()
    {
      int sum=a+b;
      System.out.println("Addition is "+sum);
    }
    public void Multiplication()
    {
      int mul=a*b;
      System.out.println("Multiplication is "+mul);
    }
}
