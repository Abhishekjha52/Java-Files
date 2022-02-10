//Java Program to read a value using console class
import java.io.*;
class Read3
{
	public static void main(String args[]) throws IOException
	{
		int n;
		Console c=System.console();
		System.out.println("Enter a value:");
		String str=c.readLine();
		n=Integer.parseInt(str);
		System.out.println("Value is "+n);
	}
}
		