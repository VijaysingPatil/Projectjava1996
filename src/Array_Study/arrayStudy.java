package Array_Study;

public class arrayStudy {

	public static void main(String[] args) {
		//single dimensional array
		String a [] = new String[5];
		a[0]="rohit";
		a[1]="shivam";
		a[2]="vijay";
		a[3]="vaibhav";
		a[4]="mayur";
		int DOB[]=new int[4];
		DOB[0]=1996;
		DOB[1]=1995; 
		DOB[2]=1994;
		DOB[3]=1993;
		System.out.println(DOB[3]);
		System.out.println("============");
		System.out.println(a[2]);
		System.out.println("===============");
		// every time time can't print each statement
		//by using for loop
		for(int r=0;r<=3;r++) 
		{
			System.out.println(DOB[r]);
		}
		System.out.println("=============");
		for (int b =0;b<=4;b++) 
		{
			System.out.println(a[b]);
		}
		System.out.println("=================");
		int f[]= {2,4,6,8,10};
		
		System.out.println("for length "+ f.length);
		
		System.out.println(f[3]);
		System.out.println("============");
		for(int n =0;n<=4;n++) 
		{
			System.out.println(f[n]);
		}System.out.println("============");
//Multi dimensional array
		String h[][]= {{"10","20","30"},{"40","50","60"},{"70","80","90"}};
		//System.out.println(h[1][1]);
		for(int r=0;r<=2;r++) 
		{
			for(int s=0;s<=2;s++) {
				
			
			System.out.print(h[r][s]+" ");
			}
			System.out.println();
			}
	}

}
