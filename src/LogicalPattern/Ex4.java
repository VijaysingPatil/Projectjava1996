package LogicalPattern;

public class Ex4 {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		// row = 5; star = 5
		
		int star =5;
		for(int i = 1;i<=5;i++) // for inner loop  row
		{
			for(int j = 1 ; j<=star;j++) // for outer loop  column 
			{
				System.out.print("* ");
			}
			star--;
			System.out.println();
		}

	}

}
