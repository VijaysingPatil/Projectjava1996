package LogicalProgram;

public class ArmStringnumber {

	public static void main(String[] args)
	{
		// ArmString Number 123 = 1^3+2^3+3^3
		
		int number = 154 ;
		int Sum = 0 ;
		
		for(int i =number;i>0;i=i/10) 
		{
			int rem = i%10;
				 Sum = Sum+(rem*rem*rem);
		}
		System.out.println(Sum);
		if(number==Sum) 
		{
			System.out.println("Given number is ArmStrong");
		}
		else 
		{
			System.out.println("Given number is Not ArmStrong");
		}
	}

}
