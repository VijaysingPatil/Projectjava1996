package Array_Study;

public class Array1 {

	public static void main(String[] args) {
		
		
char c[] = new char [5];
c[0]='A';
c[1]='B';
c[2]='C';
c[3]='D';
c[4]='E';

for(int i =0;i<=4;i++) 
{
	System.out.println(c[i]);
}
System.out.println("============multidiamensional Array=================");
char g [][]= {{'A','B','C','D'},{'E','F','G','H'}};

for(int i =0;i<=1;i++) 
{
	for(int j = 0;j<=3; j++) 
	{
		System.out.print(g[i][j]+" ");
	}
	System.out.println();
}




	}}


