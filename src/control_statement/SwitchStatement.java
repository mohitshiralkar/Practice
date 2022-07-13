package control_statement;

public class SwitchStatement {

	public static void main(String[] args)
	{
		int day=4;
		switch (day) {
		case 1:System.out.println("Today is Sunday");
     		   break;
		case 2:System.out.println("Today is monday");
		       break;
		case 3:System.out.println("Today is tuesday");
		       break;
		case 4:System.out.println("Today is wednesday");
		       break;
		case 5:System.out.println("Today is thursday");
		       break;
		case 6:System.out.println("Today is friday");
		       break;
		case 7:System.out.println("Today is saturday");
		       break;
		       
		default:System.out.println("please enter day between 1-7");
			break;
		}
	}

}
