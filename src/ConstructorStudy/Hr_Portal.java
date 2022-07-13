package ConstructorStudy;

public class Hr_Portal {

	public static void main(String[] args) {
		Employee Mohit=new Employee();
		Mohit.emp_name="Mohit Shiralkar";
		Mohit.emp_id=40;
		Mohit.emp_dept="Mechanical";
		Mohit.emp_sal=25500.335f;
		Mohit.emp_gender='M';
		
		Employee Pravin=new Employee();
		Pravin.emp_name="Pravin Patil";
		Pravin.emp_id=85;
		Pravin.emp_dept="Life Insurance";
		Pravin.emp_sal=30000.35f;
		Pravin.emp_gender='M';
		
		
        Mohit.emp_info();
        Pravin.emp_info();
        
        
	}

}
