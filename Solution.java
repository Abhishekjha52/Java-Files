//Java Program to print all real solutions of quadratic solutions
import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		int a,b,c;
		double d,root1,root2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three coefiicients: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(b*b)-4*a*c;
		if(d==0)
		{
			System.out.println("Roots are equal");
			root1=(-b)/2*a;
			root2=root1;
			System.out.println(root1+" "+root2);
		}
		else if(d>0)
		{
			System.out.println("Roots are real and distinct");
			root1=((-b)+Math.sqrt(d))/2*a;
			root2=((-b)-Math.sqrt(d))/2*a;
			System.out.println(root1+" "+root2);
		}
		else
		{
			System.out.println("Roots are Imaginary");
		}
	}
}


		