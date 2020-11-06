public class AnimalWorld
{
private String foodName;

public AnimalWorld(String food) { //constructor
	foodName=food;
}

public void setName(String food) {
	foodName=food;
}
public String getName() {
	
	return foodName;
}
public void saying() {
	System.out.printf("I love food %s\n",getName());
}
}