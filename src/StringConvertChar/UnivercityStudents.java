package StringConvertChar;

public class UnivercityStudents {

	public static void main(String[] args)
	{
		UnivercityStudents us = new UnivercityStudents();// For non static method
		us.studentInfo();
		//For non static method with parameter
		us.studentInfo("Vijaysing Patil"," NMU2017421615", "Mechanical","Engg", 'M',2020 , 67.25f);
	}	
	//name ,PRN, branch, dept, gender, passoutyear, weight 
			

	public void studentInfo()//non static method without parameter
	{
	String name;
	name = "Vijaysing Patil";
	
	String PRN;
	PRN = "MNU2017421615";
	
	String branch;
	branch = "Mechanical";
	
	String dept;
	dept = "Engg";
	
	
	char gender;
	gender = 'M';
	
	int passoutyear;
	passoutyear = 2020;
	
	float weight;
	weight = 67.25f;
	
	System.out.println("========================");
	System.out.println("My Nmae is "+name);
	System.out.println("MY PRN is "+PRN);
	System.out.println("My Branch is "+branch);
	System.out.println("My Department is "+dept);
	System.out.println("My Gender is "+gender);
	System.out.println("My Passoutyear is "+passoutyear);
	System.out.println("My weight is "+weight);
	System.out.println("=========================");
	
	}
	public void studentInfo(String name,String PRN,String branch,String dept,char gender,int passoutyear,float weight) 
	
	{
		System.out.println("========================");
		System.out.println("My Nmae is "+name);
		System.out.println("MY PRN is "+PRN);
		System.out.println("My Branch is "+branch);
		System.out.println("My Department is "+dept);
		System.out.println("My Gender is "+gender);
		System.out.println("My Passoutyear is "+passoutyear);
		System.out.println("My weight is "+weight);
		System.out.println("=========================");
		
		
		
	}
	}
	