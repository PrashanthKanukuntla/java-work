public class Helloworld
{
public static void main(String[] args)
{
	int a[]= {2,3,4,5,6};
	
	change(a);
	
	for(int y:a)
	{
		System.out.println(y);
	}
}

	public static void change(int x[])
	{
		for(int i=0; i<x.length; i++)
		{
			x[i]+=5;
		}
	}
}