package LogicalProgram;

import org.w3c.dom.css.Counter;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num = 12;
		int Counter = 0 ;
		for(int i =2;i<=num;i++) 
		{
			if(num%i==0) 
			{
				Counter++;  //1
				break;
			}
		}
			if(Counter==2) 
			{
				System.out.println("Givn Number is Not Prime ");
			}
			else 
			{
				System.out.println("Givn Number is  Prime ");
			}
		}

	}


