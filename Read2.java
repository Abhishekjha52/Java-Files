//Java Program to read a value using buffered Reading class
import java.io.*;
class Read2
{
	public static void main(String args[])throws IOException
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value:");
		String str=br.readLine();
		n=Integer.parseInt(str);
		System.out.println("Value is "+n);
	}
}