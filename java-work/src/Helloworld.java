public class Helloworld
{
public static void main(String[] args)
{
	System.out.println(average(33,44,67,98));
}

public static int average(int ... number)
{
	int total=0;
	for(int x:number)
		total+=x;
	return total/number.length;
}
}