package LogicalPattern;

public class Ex7 {

	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		//***
		//**
		//*
		// row =7 star =1
		int star =1;
		for(int i=1;i<=7;i++)      // for inner loop (Row)
		{
			for(int j=1;j<=star;j++) // for Outer loop (column)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4) 
			{
				star++;    // For Assending 
			}
			else 
			{
				star--;    // For Desending
			}
		}
		
	}

}
