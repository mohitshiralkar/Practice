package control_statement;

public class Nested_If_Else_ATM {

	public static void main(String[] args)
	{
		int pin=3456;
		int amt=5000;
		
		if(pin==3456)
		{
			System.out.println("you are entered correct pin");
			
			if(amt==5000)
			{
				System.out.println("You are entered amount in multiple of 500");
			}
			else 
			{ System.out.println("Enter amount in multiple of 500");
				
			}
		}
		else 
		{ System.out.println("You have entered Wrong pin");
			
		}
	}

}
