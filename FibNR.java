//Java Program to find fibonacci series using non recursion
import java.util.*;
class Fib
{
	static void fib(int n)
	{
		int a=0;
		int b=1;
		int c;
		System.out.println(a+" "+b);
		int i=2;
		while(i<n)
		{
			c=a+b;
			System.out.println(" "+c);	
			b=c;
			a=b;
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter no of elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		fib(n);
	}
}
	

		
		
		