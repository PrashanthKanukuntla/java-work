public class Helloworld{
	public static void main(String[] args) {
		int boy=25;
		int girl=24;
		
		if(boy>21) {
			System.out.println("The boy is eligible for marriage");
			if(girl>18) {
				System.out.println("the girl is eligible for marriage");
			}else {
				System.out.println("the girl is not eligible for marriage");
			}
		}else {
				System.out.println("the boy is not eligible for marriage");
		}
	}
}