package loop;

public class Reverse {

	public static void main(String[] args) {
		int a=967,i,rev=0;
		do {
			
			i=a%10;
			rev=rev*10+i;
			a=a/10;
		
		}while(a>0);
		
		System.out.println("Reverse number= "+rev);

	}

}
