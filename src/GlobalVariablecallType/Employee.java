package GlobalVariablecallType;

public class Employee {

	//name, empid, sal,desg, age, gender
	
	
	String emp_name;
	String emp_id ;
	float emp_sal ;       //global variable
	String emp_desg;
	int emp_age ;
	char emp_gender;
	
	
	
	
	public void emp_info()
	{
	System.out.println("Employee name is "+emp_name);
	System.out.println("Employee id is "+emp_id);
	System.out.println("Employe sallery is "+emp_sal); 
	System.out.println("Employee designation is "+emp_desg);
	System.out.println("Employee age is "+emp_age);
	System.out.println("Epmloyee gendar is "+emp_gender);
	
	}
	

}
		
		
	


