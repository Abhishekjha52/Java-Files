//Java Program to find the number is equal or greater or lesser than each other
import java.util.*;
class Compare
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Number "+a+" is greater than"+b);
		}
		else if(a<b)
		{
			System.out.println("Number "+a+" is lesser than "+b);
		}
		else
		{
			System.out.println("Numbers are equal");
		}
	}
}