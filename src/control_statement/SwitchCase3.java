package control_statement;

public class SwitchCase3 {

	public static void main(String[] args) {
		char Grade='E';
		
		switch (Grade) {
		case 'A':System.out.println("You got marks in the range of 75 to 90");
			     break;
		case 'B' :System.out.println("You got marks in the range of 60 to 74");
		          break;
		case 'C' :System.out.println("You got marks in the range of 45 to 59");
                  break;
		case 'D' :System.out.println("You got marks in the range of 35 to 44");
		          break;
		default: System.out.println("You are fail");
			break;
		}

	}

}
