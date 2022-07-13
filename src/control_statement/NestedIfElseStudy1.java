package control_statement;

public class NestedIfElseStudy1 {

	public static void main(String[] args) {
    
	String fingurprint="Accepted";
	String OTP="4543";
	
	if(fingurprint=="Accepted")
		
	{System.out.println("proceed for otp process");
	
	if (OTP=="4546") 
	{
		System.out.println("you are welcome");
	}
	else {
		System.out.println("OTP is incorrect");
	}
	}
	else {
		System.out.println("Fingureprint doesn't match to data");
	}
	}

}
