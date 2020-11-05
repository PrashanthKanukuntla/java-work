import java.util.*;
public class Helloworld{
	public static void main(String[] args) {
		//int boy=25;
		//int girl=24;
	Scanner cat= new Scanner(System.in);
	System.out.println("Enter the boy age");
		int boy=cat.nextInt();
	System.out.println("Enter the girl age");
		int girl=cat.nextInt();
		
		if(boy>=21) {
			System.out.println("The boy is : "+boy+ " and eligible for marriage");
			if(girl>=18) {
				System.out.println("the girl is : "+girl+ " and eligible for marriage");
			}else {
				System.out.println("the girl is : "+girl+" and not eligible for marriage");
			}
		}else {
				System.out.println("the boy is : "+boy+" and not eligible for marriage");
		}
		cat.close();
	}
}