import java.util.*;
public class Helloworld
{
public static void main(String[] args)
{
	Scanner shark= new Scanner(System.in);
	
	double amount;
	
	System.out.println("enter the price");
	double price=shark.nextDouble();
	
	System.out.println("enter the rate");
	double rate=shark.nextDouble();
	
	for(int day=1; day<=20; day++) {
		amount=price*Math.pow(1+rate, day);
		System.out.println(day+" "+amount);
	}
}
}