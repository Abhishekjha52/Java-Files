//Java program to perform division
import java.util.*;
class Div
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is: "+c);
	}
}