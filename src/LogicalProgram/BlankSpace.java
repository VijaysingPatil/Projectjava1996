package LogicalProgram;



public class BlankSpace {

	public static void main(String[] args) {

String s = "my name is Rohit Patil";
int Counter = 0;
for(int i=0;i<=s.length()-1;i++) 
{
	char blank = s.charAt(i);
	if(blank==' ') 
	{
		Counter++;
	}
	
}
System.out.println("Number of Blank Space "+ s+" is "+ Counter);

	}

}
