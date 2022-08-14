package LogicalPattern;

public class Daimond {
	public static void main(String[] args) {
		
	
	

//	           *
//		      ***
//			 *****
//	   		*******
//		   *********
//			*******
//			 *****
//			  ***
//             *   
	//row =8
	int space = 4;
	int star = 1;
	for(int i=1;i<=9;i++) 
	{
		for(int j=1;j<=space;j++) 
		{
			System.out.print(" ");
		}
		for(int l=1;l<=star;l++) 
		{
			System.out.print("*");
		}
		if(i<5) 
		{
			star=star+2;
			space--;
		}
		else
		{ 
			star=star-2;
			space++;
		}
		System.out.println();
	}

}
}