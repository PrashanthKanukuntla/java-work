import java.util.Scanner;
public class Helloworld{
	public static void main(String[] args) {
		Scanner sun= new Scanner(System.in);
		
		System.out.println("enter the grades");
		
		int count=0;
		int grade;
		int total=0;
		int average;
		while(count<10) {
			grade =sun.nextInt();
			total+=grade;
			count++;
		}
		average= total/10;
		System.out.println("the average is :-"+average);
	}
}