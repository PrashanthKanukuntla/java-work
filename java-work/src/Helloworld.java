import java.util.*;
class Helloworld{
	public static void main(String[] args)
	{
		Scanner monkey= new Scanner(System.in);
		String name= monkey.nextLine();
		
		System.out.println("enter the name of animal");
		
		AnimalWorld am= new AnimalWorld();
		am.animal(name);
		
	}
}