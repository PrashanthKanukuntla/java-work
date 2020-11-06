import java.util.*;
public class Helloworld{
	public static void main(String[] args) {
		
		Scanner fruit= new Scanner(System.in);
		System.out.println("Enter your age");
		int age=fruit.nextInt();
		
		switch(age) {
		case 3:
			System.out.println("You are ready to go to preschool");
			break;
		case 5:
			System.out.println("You are go to school");
			break;
		case 15:
			System.out.println("You are complete you high school");
			break;
		case 17:
			System.out.println("You are completed your 10+2 ");
			break;
		case 20:
			System.out.println("You are a graduate holder");
			break;
		case 23:
			System.out.println("You are a post graduate holder");
			break;
		case 25:
			System.out.println("You are ready to get marriage");
			break;
		 default:
			System.out.println("You entered incorrect age");
			break;
		}
	}
}