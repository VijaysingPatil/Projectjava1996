package LogicalPattern;

public class Ex1Square {

	public static void main(String[] args) 
	{    
		//*
		//**
		//***
		//****
		//*****
	    //row = 5, coluumn = (min=1),star
		int star = 1;
		for(int i =1;i<=5;i++) 
		{
			for(int j = 1;j<=star;j++) 
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
	}

}
