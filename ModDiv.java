//Java program to perform Mod division
import java.util.*;
class ModDiv
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a%b;
		System.out.println("MDivision is: "+c);
	}
}