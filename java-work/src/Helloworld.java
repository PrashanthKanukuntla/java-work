import java.util.Scanner;
public class Helloworld
{
public static void main(String[] args) 
{
	Scanner horse= new Scanner(System.in);
	System.out.println("enter your age");
	int age=horse.nextInt();
	
	System.out.println(age>=18?"you havae been eligible for apply voter Id" : "you will not eligible for apply voter Id");
}	
}