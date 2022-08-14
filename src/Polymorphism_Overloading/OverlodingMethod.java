package Polymorphism_Overloading;

public class OverlodingMethod {

	public static void main(String[] args) 
	{
		OverlodingMethod o = new OverlodingMethod();
		o.Student_Info();     //Zero Parameter
		o.Student_Info("Vijay", 66.68f);   //With Parameter
		o.Student_Info("Rohit", 76.5f);
		o.Studentinfo("Shivam Patil", 24, 'M');
		o.StudentInfo("Mayur Patil", 29, 23456.364f, 'M');

	}
public void Student_Info() 
{   System.out.println("Zero Parameter");
	String Name="Vijaysing";
	float Weight= 66.68f;
	System.out.println("My Name is "+Name);
    System.out.println("My Weight is "+Weight);
    System.out.println("===========================");

}
public void Student_Info(String Name,float Weight) 
{
	Name="Rohit Patil";
	Weight= 76.5f;
	System.out.println("With Two Parameter");
	System.out.println("My Name is "+Name);
    System.out.println("My Weight is "+Weight);
    System.out.println("=================================");
    
}
public void Studentinfo(String Name,int Age,char Gender)
{
	Name = "Shivam Patil";
	Age = 24;
	Gender = 'M';
	System.out.println("With Three Parameter");
	System.out.println("My Name is "+Name);
    System.out.println("My Age is "+Age);
    System.out.println("My Gender is "+Gender);
    System.out.println("=================================");
	
	
}
public void StudentInfo(String Name,int Age,float Salary,char Gender) 
{
	Name = "Mayur Patil";
	Age = 29;
	Salary = 23456.364f;
	Gender = 'M';
	
	System.out.println("With Four Parameter");
	System.out.println("My Name is "+Name);
    System.out.println("My Age is "+Age);
    System.out.println("My Salary is"+Salary);
    System.out.println("My Gender is "+Gender);
    System.out.println("=================================");
	
}
}
