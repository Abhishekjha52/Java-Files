//Java Program to find fibonacci series using non recursion
import java.util.*;
class Fib1
{
	static int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return (fib(n-1)+fib(n-2));
	}
	public static void main(String args[])
	{
		int n,i;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
}
	

		
		
		