package GlobalVariablecallType;

public class hrstudy {

	public static void main(String[] args) 
	{
Employee em = new Employee();
em.emp_name = "vijysing";
em.emp_id = "vr1996";
em.emp_sal = 1275.585f;
em.emp_desg = "trainee Eng";
em.emp_age = 25;
em.emp_gender = 'm';


Employee m = new Employee();
m.emp_name = "mayur";
m.emp_id = "my1996";
m.emp_sal = 3775.58f;
m.emp_desg = "trainee Eng";
m.emp_age = 25;
m.emp_gender = 'm';




em.emp_info();
m.emp_info();


	}

}
