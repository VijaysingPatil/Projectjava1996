package LogicalPattern;

public class Ex5 {

	public static void main(String[] args) 
	{
		//*****
		// ****
		//  ***
		//   **
		//    *
		// row=5; star =5 space=0
		int space = 0;
		int star =5;
		for(int i =1;i<=5; i++) 
		{
			for(int k=1;k<=space; k++) //  for 1st row space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)  // for 
			{
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println();
			
		}
	}

}
