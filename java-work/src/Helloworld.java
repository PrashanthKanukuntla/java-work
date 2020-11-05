public class Helloworld
{
public static void main(String[] args) 
{
	Byte bigByte=101;
	System.out.println(bigByte);
	
	String bigbyte_String =Byte.toString(bigByte);
	System.out.println(bigbyte_String+"\n");
	
	short bigShort =202;
	System.out.println(bigShort);
	
	String bigShort_String=Short.toString(bigShort);
	System.out.println(bigShort_String+"\n");
	
	
	int bigInt=2020;
	System.out.println(bigInt);
	
	String intString=Integer.toString(bigInt);
	System.out.println(intString+"\n");
	
	
	long bigLong=202020;
	System.out.println(bigLong);
	
	String longString=Long.toString(bigLong);
	System.out.println(longString+"\n");
	
	
	float bigFloat =2343;
	System.out.println(bigFloat);
	
	String bigFloat_String=Float.toString(bigFloat);
	System.out.println(bigFloat_String+"\n");
	
	
	double bigDouble=2020303030;
	System.out.println(bigDouble);
	
	String bigDouble_String =Double.toString(bigDouble);
	System.out.println(bigDouble_String);
}	
}