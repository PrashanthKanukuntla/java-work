import java.util.*;

class Helloworld
{
	public static void main(String[] args) 
	{
		Scanner tiger= new Scanner(System.in);
		
		System.out.println("Enter your first girl friend name :-");
		
		AnimalWorld am;
		am= new AnimalWorld();
		String temp=tiger.nextLine();
		
		am.setName(temp);
		am.saying();
	}
}