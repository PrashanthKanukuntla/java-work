public class Helloworld
{
public static void main(String[] args)
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{2,3,5},{3},{6,7,8,9}};
	
	System.out.println("this is the first array");
	display(a);
	
	System.out.println("this is the second array");
	display(b);
}

	public static void display(int x[][]) 
	{
	for(int row=0; row<x.length; row++)
	{
		for(int column=0; column<x[row].length;column++)
		{
			System.out.print(x[row][column]+"\t");
		}
			System.out.println();
	}
	}
}