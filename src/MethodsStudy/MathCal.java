package MethodsStudy;

public class MathCal {

	public static void main(String[] args) {
		MathCal m=new MathCal();
		m.cal(15,20, 100, 50, 30, 30, 1000, 50);

	}
    public void cal(int a, int b, int c, int d, int e, int f, int g, int h)
    {
    	System.out.println("==========================");
    	System.out.println("Addition is       = "+(a+b));
    	System.out.println("Substraction is   = "+(c-d));
    	System.out.println("Multiplication is = "+(e*f));
    	System.out.println("Divion is         = "+(g/h));
    	System.out.println("==========================");
    }
}
